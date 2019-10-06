package com.irsyadashari.kade_submission_1

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.marginBottom
import org.jetbrains.anko.*

class DetailActivity : AppCompatActivity() {

    lateinit var leagueNameTextView: TextView
    lateinit var leagueDescriptionTextView: TextView
    lateinit var leagueLogoImageView: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

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

        val intentFromMainActivity = intent.getParcelableExtra<Item>("item")

        leagueNameTextView.text = intentFromMainActivity.name
        leagueDescriptionTextView.text = intentFromMainActivity.description
        leagueLogoImageView.imageResource = intentFromMainActivity.image
    }
}
