package com.example.fitnessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView

class PlanksActivity : AppCompatActivity() {
    lateinit var mplanks:CardView
    lateinit var aboutplanks:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planks)
        mplanks = findViewById(R.id.planks_card)
        aboutplanks = findViewById(R.id.abt_planks)
    }
}