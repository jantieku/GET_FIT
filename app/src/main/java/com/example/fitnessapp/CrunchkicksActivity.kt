package com.example.fitnessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.cardview.widget.CardView

class CrunchkicksActivity : AppCompatActivity() {
    lateinit var crunchkicks:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crunchkicks)
        crunchkicks = findViewById(R.id.crunch_kicks_card)

    }
}