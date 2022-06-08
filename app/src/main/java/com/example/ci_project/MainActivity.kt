package com.example.ci_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var toastText: String
    private lateinit var button: Button
    private lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById<Button>(R.id.button)
        editText = findViewById<EditText>(R.id.editText1)
        button.setOnClickListener {
            getResponse()
            Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show()
        }


    }

    private fun getResponse() {
        toastText = if (editText.text.toString() == "hi") {
            "Hi there :)"
        } else {
            ":("
        }

    }
}