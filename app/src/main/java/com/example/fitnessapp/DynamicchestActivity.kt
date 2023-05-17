package com.example.fitnessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView

class DynamicchestActivity : AppCompatActivity() {
    lateinit var dchestcard:CardView
    lateinit var aboutdchest:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamicchest)
        dchestcard = findViewById(R.id.dynamicchest_card)
        aboutdchest = findViewById(R.id.abt_dynamicchest)
    }
}