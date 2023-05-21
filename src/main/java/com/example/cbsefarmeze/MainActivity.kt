package com.example.cbsefarmeze

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button1)
        val button1 = findViewById<Button>(R.id.button2)
        val button2 = findViewById<Button>(R.id.button3)
        val button3 = findViewById<Button>(R.id.button5)
        val button4 = findViewById<Button>(R.id.button6)
        button.setOnClickListener {
            val Intent = Intent(this, activity2::class.java)
            startActivity(Intent)
        }

        button1.setOnClickListener {
            val Intent = Intent(this, activity3::class.java)
            startActivity(Intent)
        }

        button2.setOnClickListener {
            val Intent = Intent(this, activity4::class.java)
            startActivity(Intent)
        }
        button3.setOnClickListener {
            val Intent = Intent(this, activity5::class.java)
            startActivity(Intent)
        }

        button4.setOnClickListener {
            val Intent = Intent(this, activity6::class.java)
            startActivity(Intent)
        }

    }
}
