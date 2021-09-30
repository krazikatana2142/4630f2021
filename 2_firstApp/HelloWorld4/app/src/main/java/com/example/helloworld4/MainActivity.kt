package com.example.helloworld4

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickCounterText: TextView = findViewById(R.id.clickCounter)
        var clickCounter = 0

        //This makes the button show a text when clicked on and also increments the click counter using strings in XML
        val button = findViewById<Button>(R.id.buttonAdd) as Button
        button.setOnClickListener(){
            clickCounter+=1
            clickCounterText.text = clickCounter.toString()
        }

        val button1 = findViewById<Button>(R.id.buttonSubtract)
        button1.setOnClickListener(){
            clickCounter-=1
            clickCounterText.text = clickCounter.toString()
        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener(){
            Toast.makeText(this, "Nothing Happaned WOOO!", Toast.LENGTH_SHORT).show()
        }

        //This code takes the TextView from the XML and manipulates the text here
        val textView2: TextView = findViewById(R.id.textView2)
        textView2.setTextColor(Color.RED)

        val textView1: TextView = findViewById(R.id.textView1)
        textView1.setTextColor(Color.GREEN)

    }
}