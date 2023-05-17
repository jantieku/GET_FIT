package com.example.fitnessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView

class TricepDipsActivity : AppCompatActivity() {
    lateinit var tricepdips: CardView
    lateinit var abouttdips:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tricep_dips)
        tricepdips = findViewById(R.id.tricepdips_card)
        abouttdips = findViewById(R.id.abt_tricepdips)
    }
}