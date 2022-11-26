package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var materialButton: MaterialButton
    private lateinit var btPlaygame: MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        materialButton = findViewById(R.id.materialButton)
        btPlaygame = findViewById(R.id.btPlaygame)

        materialButton.setOnClickListener {
            Toast.makeText(applicationContext,"Congrats!",Toast.LENGTH_SHORT).show()
        }

        btPlaygame.setOnClickListener {
            textView.text = (textView.text.toString().toInt() + 1).toString()
        }
    }

}