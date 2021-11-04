package com.example.helloworld4

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationAvailability
import com.google.android.gms.location.LocationServices

class MainActivity : AppCompatActivity() {

    lateinit var fusedLocationProviderClient: FusedLocationProviderClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)
        ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION), 101)

        val sw1 = findViewById<Switch>(R.id.switch1)
        sw1?.setOnCheckedChangeListener({ _ , isChecked ->
            val message = if (isChecked) "Switch1:ON" else "Switch1:OFF"
            Toast.makeText(this@MainActivity, message,
                Toast.LENGTH_SHORT).show()


        })



        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener(){
            Toast.makeText(this, "Nothing Happaned WOOO!", Toast.LENGTH_SHORT).show()
        }

        //This code takes the TextView from the XML and manipulates the text here
        val textView2: TextView = findViewById(R.id.textView2)
        textView2.setTextColor(Color.BLACK )

        val textView1: TextView = findViewById(R.id.textView1)
        textView1.setTextColor(Color.BLACK)

    }
}