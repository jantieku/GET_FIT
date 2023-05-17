package com.example.fitnessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView

class SidehopActivity : AppCompatActivity() {
    lateinit var cardsidehop:CardView
    lateinit var textsidehop:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sidehop)
        cardsidehop = findViewById(R.id.sidehop_card)
        textsidehop = findViewById(R.id.abt_sidehop)

    }
}