package com.example.fitnessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView

class PunchesActivity : AppCompatActivity() {
    lateinit var mpunches:CardView
    lateinit var aboutpunches:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_punches)
        mpunches = findViewById(R.id.punches_card)
        aboutpunches = findViewById(R.id.abt_punches)
    }
}