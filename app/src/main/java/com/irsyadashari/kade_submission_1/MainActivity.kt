package com.irsyadashari.kade_submission_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    private var items: MutableList<Item> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()

        club_list.layoutManager = LinearLayoutManager(this)
        club_list.adapter = RecyclerViewAdapter(this, items){

            //Penggunaan Anko Commons : Dialog
            toast(it.name.toString())

            val intentObj = Intent(this,DetailActivity::class.java)
            intentObj.putExtra("item",it)
            startActivity(intentObj)
        }



    }

    private fun initData(){
        val name = resources.getStringArray(R.array.league_names)
        val image = resources.obtainTypedArray(R.array.league_logos)
        val description = resources.getStringArray(R.array.league_desc)

        items.clear()

        for (i in name.indices) {
            items.add(Item(name[i],
                description[i],
                image.getResourceId(i, 0)))
        }

        //Recycle the typed array
        image.recycle()
    }

}
