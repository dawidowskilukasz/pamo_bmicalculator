package com.example.bmicalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ToBuy : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tobuy_screen)

        val ingredients = listOf("Tomatoes", "Cucumber", "Red onion", "Bell pepper", "Kalamata olives",
                "Feta cheese", "Olive oil", "Red wine vinegar", "Dried oregano", "Salt", "Pepper")

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val adapter = ToBuyAdapter(ingredients)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        val backButton: Button = findViewById(R.id.back_button)
        backButton.setOnClickListener {
            val intent = Intent(this, Recipe::class.java)
            startActivity(intent)
        }
    }
}
