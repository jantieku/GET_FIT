package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView

class ArmsWorkoutActivity : AppCompatActivity() {
    lateinit var marms:TextView
    lateinit var aboutarms:TextView
    lateinit var dchest:CardView
    lateinit var mpunches:CardView
    lateinit var tdips:CardView
    lateinit var mplanks:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arms_training)
        marms = findViewById(R.id.arms)
        aboutarms = findViewById(R.id.abt_arms)
        dchest = findViewById(R.id.dynamicchest_card)
        mpunches = findViewById(R.id.punches_card)
        tdips = findViewById(R.id.tricepdips_card)
        mplanks = findViewById(R.id.planks_card)

        dchest.setOnClickListener {
            var dynamicchest = Intent(this, DynamicchestActivity::class.java)
            startActivity(dynamicchest)

        }
        mpunches.setOnClickListener {
            var punches = Intent(this, PunchesActivity::class.java)
            startActivity(punches)

        }
        tdips.setOnClickListener {
            var tricepdips = Intent(this, TricepDipsActivity::class.java)
            startActivity(tricepdips)

        }
        mplanks.setOnClickListener {
            var planks = Intent(this, PlanksActivity::class.java)
            startActivity(planks)
            
        }
    }
}