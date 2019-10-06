package com.irsyadashari.kade_submission_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.irsyadashari.kade_submission_1.model.Item
import org.jetbrains.anko.*

class DetailActivity : AppCompatActivity() {

    lateinit var leagueNameTextView: TextView
    lateinit var leagueDescriptionTextView: TextView
    lateinit var leagueLogoImageView: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Penerapan Anko Layout
        verticalLayout {
            padding = dip(16)

            leagueLogoImageView = imageView().lparams {
                padding = dip(20)
                margin = dip(16)
                gravity = Gravity.CENTER
            }
            leagueNameTextView = textView{
                padding = dip(20)
                textSize = 24f
                textAlignment = View.TEXT_ALIGNMENT_TEXT_END
            }.lparams {
                margin = dip(16)
            }
            leagueDescriptionTextView = textView().lparams {
                padding = dip(20)
                margin = dip(16)
            }
        }

        //Getting Value from MainActivity
        val intentFromMainActivity = intent.getParcelableExtra<Item>("item")

        //Setting value to UI
        leagueNameTextView.text = intentFromMainActivity.name
        leagueDescriptionTextView.text = intentFromMainActivity.description
        leagueLogoImageView.imageResource = intentFromMainActivity.image
    }
}
