package com.example.core_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView

class UniversityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_university)


        val information = intent.getParcelableExtra<Information>("station")
        val name = findViewById<TextView>(R.id.universityName)
        val date = findViewById<TextView>(R.id.universityDate)
        val location = findViewById<TextView>(R.id.universityLocation)
        val score = findViewById<RatingBar>(R.id.universityRatingBar)

        name.text = information?.name.toString()
        date.text = information?.date.toString()
        location.text = information?.location.toString()
        score.rating = information?.Score?.toFloat()!!

    }
}