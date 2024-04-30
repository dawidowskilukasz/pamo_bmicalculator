package com.example.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Welcome extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);

        Button bmiCalculatorButton = findViewById(R.id.start_button);
        bmiCalculatorButton.setOnClickListener(v -> {
            Intent intent = new Intent(Welcome.this, MenuActivity.class);
            startActivity(intent);
        });
    }
}