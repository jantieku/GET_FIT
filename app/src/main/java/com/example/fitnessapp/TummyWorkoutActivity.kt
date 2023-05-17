package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView

class TummyWorkoutActivity : AppCompatActivity() {
    lateinit var flatstomach:TextView
    lateinit var aboutflatstomach:TextView
    lateinit var crunchkicks:CardView
    lateinit var abdominalcrunches:CardView
    lateinit var reversecrunches:CardView
    lateinit var russiantwist:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tummy_workout)
        flatstomach = findViewById(R.id.flat_stomach)
        aboutflatstomach = findViewById(R.id.abt_flatstomach)
        crunchkicks = findViewById(R.id.crunchkicks_card)
        abdominalcrunches = findViewById(R.id.abdominal_crunches_card)
        reversecrunches = findViewById(R.id.reverse_crunches_card)
        russiantwist = findViewById(R.id.russian_twist_card)
        crunchkicks.setOnClickListener {
            var crunchkicks = Intent(this, CrunchkicksActivity::class.java)
            startActivity(crunchkicks)

        }
        abdominalcrunches.setOnClickListener {
            var abdominalcrunches = Intent(this, AbdominalCrunchesActivity::class.java)
            startActivity(abdominalcrunches)
        }
        reversecrunches.setOnClickListener {
            var reversecrunches = Intent(this, ReverseCrunchesActivity::class.java)
            startActivity(reversecrunches)

        }
        russiantwist.setOnClickListener {
            var russiantwist = Intent(this, RussianTwistActivity::class.java)
            startActivity(russiantwist)

        }
    }
}