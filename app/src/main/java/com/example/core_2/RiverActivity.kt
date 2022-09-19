package com.example.core_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView

class RiverActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_river)


        val information = intent.getParcelableExtra<Information>("station")
        val name = findViewById<TextView>(R.id.riverName)
        val date = findViewById<TextView>(R.id.riverDate)
        val location = findViewById<TextView>(R.id.riverLocation)
        val score = findViewById<RatingBar>(R.id.riverRatingBar)

        name.text = information?.name.toString()
        date.text = information?.date.toString()
        location.text = information?.location.toString()
        score.rating = information?.Score?.toFloat()!!

    }
}