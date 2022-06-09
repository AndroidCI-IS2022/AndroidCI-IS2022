package com.example.ci_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        editText = findViewById(R.id.editText1)
        button.setOnClickListener {
            val toastText = Greeter.getGreeting(editText.text.toString().lowercase())
            Toast.makeText(this, toastText, Toast.LENGTH_LONG).show()
        }


    }

}