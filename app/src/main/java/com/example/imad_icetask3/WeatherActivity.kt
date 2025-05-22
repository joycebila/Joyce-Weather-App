package com.example.imad_icetask3

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private val Any.button: Int
    get() {
        TODO("Not yet implemented")
    }
private val Any.main: Int
    get() {
        TODO("Not yet implemented")
    }
private val R.Companion.id: Any
    get() {
        TODO("Not yet implemented")
    }
private val Any.activity_weather: Any
    get() {
        TODO("Not yet implemented")
    }
private val R.Companion.layout: Any
    get() {
        TODO("Not yet implemented")
    }

class WeatherActivity : AppCompatActivity() {

    private val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    private val maxTemps = arrayOf(25, 29, 22, 24, 20, 18, 16)

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(
            R.layout
                .activity_weather)
        val textWeatherInfo = findViewById<TextView>(/* id = */ R.id.main)
        val btnBack = findViewById<Button>(/* id = */ R.id.button)

        // Display day-temperature data
        var displayText = ""
        var total = 0
        for (i in days.indices) {
            displayText += "${days[i]}: ${maxTemps[i]}°C\n"
            total += maxTemps[i]
        }

        // Calculate and display average
        val average = total / maxTemps.size
        displayText += "\nAverage Max Temp: $average°C"

        textWeatherInfo.text = displayText

        // Back button
        btnBack.setOnClickListener {
            finish()
        }
    }

    private fun setContentView(activityWeather: Any) {
        var todo = TODO("Not yet implemented")
    }
}

class R {
    companion object {




    }

}



