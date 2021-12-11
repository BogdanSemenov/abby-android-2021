package com.example.androidabbyy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import android.view.animation.AnimationUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        super.setTitle(getString(R.string.notes))

        findViewById<CardView>(R.id.annotation).setOnClickListener {
            var intent = Intent(this, Description::class.java)
            it.startAnimation(AnimationUtils.loadAnimation(this, R.anim.card_click_animation))
            startActivity(intent)
        }
    }

}
