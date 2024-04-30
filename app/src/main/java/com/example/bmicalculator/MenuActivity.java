package com.example.bmicalculator;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_screen);

        Button bmiCalculatorButton = findViewById(R.id.bmi_calculator_button);
        bmiCalculatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, BMI.class);
                startActivity(intent);
            }
        });

        Button calorieCalculatorButton = findViewById(R.id.calorie_calculator_button);
        calorieCalculatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, Calories.class);
                startActivity(intent);
            }
        });

        Button recipeShowcaseButton = findViewById(R.id.recipe_showcase_button);
        recipeShowcaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, Recipe.class);
                startActivity(intent);
            }
        });
    }
}
