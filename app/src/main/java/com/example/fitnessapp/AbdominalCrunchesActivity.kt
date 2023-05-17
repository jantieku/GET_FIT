package com.example.fitnessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView

class AbdominalCrunchesActivity : AppCompatActivity() {
    lateinit var abdcrunches:CardView
    lateinit var aboutabdcrunches:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abdominal_crunches)
        abdcrunches = findViewById(R.id.abdominal_crunches_card)
        aboutabdcrunches =findViewById(R.id.abt_abdominalcrunches)!!
    }
}