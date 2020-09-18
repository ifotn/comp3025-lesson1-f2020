package com.infrontofthenet.f20lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // create button onClick handler to display a message
        buttonSayHi.setOnClickListener {
            // get the name entered in the edit text
            val name = editTextName.text

            val message = "Hello $name"

            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
    }
}