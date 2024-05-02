package com.example.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Recipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_screen);

        Button backButton = findViewById(R.id.back_button);

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(Recipe.this, MenuActivity.class);
            startActivity(intent);
        });

        Button recipeShowcaseButton = findViewById(R.id.tobuy_button);
        recipeShowcaseButton.setOnClickListener(v -> {
            Intent intent = new Intent(Recipe.this, ToBuy.class);
            startActivity(intent);
        });
    }
}
