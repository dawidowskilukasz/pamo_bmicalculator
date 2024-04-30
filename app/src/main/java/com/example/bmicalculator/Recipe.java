package com.example.bmicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Recipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_screen);

        Button backButton = findViewById(R.id.back_button);

        backButton.setOnClickListener(v -> {
            finish(); // Close the activity and return to the previous screen
        });
    }
}
