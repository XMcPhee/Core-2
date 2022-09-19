package com.example.core_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.core.graphics.drawable.toDrawable
import org.w3c.dom.Text

class TrainStationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trainstation)

        val information = intent.getParcelableExtra<Information>("station")
        val name = findViewById<TextView>(R.id.essendonName)
        val date = findViewById<TextView>(R.id.essendonDate)
        val location = findViewById<TextView>(R.id.essendonLocation)
        val score = findViewById<RatingBar>(R.id.ratingBar)

        name.text = information?.name.toString()
        date.text = information?.date.toString()
        location.text = information?.location.toString()
        score.rating = information?.Score?.toFloat()!!

    }
}