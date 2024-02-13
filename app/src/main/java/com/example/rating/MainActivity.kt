package com.example.rating

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var text: TextView
    lateinit var rating: RatingBar
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.valorSelecionado)
        rating = findViewById(R.id.ratingBar)
        btn = findViewById(R.id.button)

        rating.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            text.text = rating.toString()
        }

        btn.setOnClickListener {
            Toast.makeText(applicationContext, "Valor selecionado = " + rating.rating, Toast.LENGTH_LONG).show()
        }



    }
}