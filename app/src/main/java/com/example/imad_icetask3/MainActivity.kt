package com.example.simpleweather

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.imad_icetask3.R
import com.example.imad_icetask3.WeatherActivity

private val Any.button: Int
    get() {
        TODO("Not yet implemented")
    }
private val R.Companion.id: Any
    get() {
        TODO("Not yet implemented")
    }
private val Any.activity_main: Any
    get() {
        TODO("Not yet implemented")
    }
private val Any.layout: Any
    get() {
        TODO("Not yet implemented")
    }

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Correct layout reference
        setContentView(R.layout.activity_main)  // Assuming activity_main.xml is your layout file

        // Correct button reference
        val btnStart = findViewById<Button>(R.id.button)  // Replace btnStart with the actual ID of your button

        btnStart.setOnClickListener {
            val intent = Intent(this, WeatherActivity::class.java)
            startActivity(intent)  // Start the WeatherActivity when the button is clicked
        }
    }

    private fun setContentView(activityMain: Any) {
        TODO("Not yet implemented")
    }
}







