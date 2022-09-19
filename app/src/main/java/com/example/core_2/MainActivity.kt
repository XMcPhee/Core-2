package com.example.core_2

import android.content.Intent
import android.media.Image
import android.media.Rating
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.drawToBitmap
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val stationPicture = findViewById<ImageView>(R.id.trainStationPicture)
        val riverPicture = findViewById<ImageView>(R.id.riverImage)
        val parkPicture = findViewById<ImageView>(R.id.parkPicture)
        val universityPicture = findViewById<ImageView>(R.id.universityPicture)

        //Universal location for all places
        val location = "Melbourne"

        //Information about Train Station
        val stationName = "Essendon Station"
        val stationRating = findViewById<TextView>(R.id.trainStationScore).text.toString()
        val stationDate = "2/09/2022"


        //Information about River
        val riverName = "Maribyrnong River"
        val riverRating: String = findViewById<TextView>(R.id.riverScore).text.toString()
        val riverDate = "8/09/2022"

        //Information about Park
        val parkName = "Brimbank Park"
        val parkRating: String = findViewById<TextView>(R.id.parkScore).text.toString()
        val parkDate = "4/09/2022"

        //Information about University
        val universityName = "Swinburne"
        val universityRating: String = findViewById<TextView>(R.id.universityScore).text.toString()
        val universityDate = "12/09/2022"



        //Onclick listeners for each picture to start individual activities
        stationPicture.setOnClickListener{
            val intent = Intent(this, TrainStationActivity::class.java).apply {
                putExtra("station", Information(stationName, location, stationRating, stationDate))
            }
            startActivity(intent)
        }

        riverPicture.setOnClickListener{
            val intent = Intent(this, RiverActivity::class.java).apply {
                putExtra("station", Information(riverName, location, riverRating, riverDate))
            }
            startActivity(intent)
        }
        parkPicture.setOnClickListener{
            val intent = Intent(this, ParkActivity::class.java).apply {
                putExtra("station", Information(parkName, location, parkRating, parkDate))
            }
            startActivity(intent)
        }
        universityPicture.setOnClickListener{
            val intent = Intent(this, UniversityActivity::class.java).apply {
                putExtra("station", Information(universityName, location, universityRating,
                    universityDate))
            }
            startActivity(intent)
        }
    }
}