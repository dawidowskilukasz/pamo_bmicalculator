package com.example.bmicalculator;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class BMI extends AppCompatActivity {
    private EditText HeightNumber;
    private EditText WeightNumber;
    private TextView ResultText;
    private Button CalculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_screen);

        HeightNumber = findViewById(R.id.HeightNumber);
        WeightNumber = findViewById(R.id.WeightNumber);
        ResultText = findViewById(R.id.ResultText);
        CalculateButton = findViewById(R.id.CalculateButton);
        Button backButton = findViewById(R.id.back_button);

        CalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateAndDisplayBMI();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void calculateAndDisplayBMI() {
        String weightStr = WeightNumber.getText().toString();
        String heightStr = HeightNumber.getText().toString();

        if (!weightStr.isEmpty() && !heightStr.isEmpty()) {
            double weight = Double.parseDouble(weightStr);
            double height = Double.parseDouble(heightStr) / 100;

            if (height > 0) {
                double bmi = weight / (height * height);
                ResultText.setText(String.format(Locale.getDefault(), "%.1f", bmi));
            }
        }
    }
}

/*Autor: Łukasz Dawidowski s22621*/