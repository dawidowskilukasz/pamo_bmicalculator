package com.example.bmicalculator;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Locale;

public class BMI extends AppCompatActivity {
    private EditText heightNumber;
    private EditText weightNumber;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_screen);

        heightNumber = findViewById(R.id.HeightNumber);
        weightNumber = findViewById(R.id.WeightNumber);
        resultText = findViewById(R.id.ResultText);
        Button calculateButton = findViewById(R.id.CalculateButton);
        Button backButton = findViewById(R.id.back_button);

        calculateButton.setOnClickListener(v -> calculateAndDisplayBMI());

        backButton.setOnClickListener(v -> finish());
    }

    private void calculateAndDisplayBMI() {
        String weightStr = weightNumber.getText().toString();
        String heightStr = heightNumber.getText().toString();

        if (!weightStr.isEmpty() && !heightStr.isEmpty()) {
            double weight = Double.parseDouble(weightStr);
            double height = Double.parseDouble(heightStr) / 100;

            double bmi = BMICalculator.calculateBMI(weight, height);
            resultText.setText(String.format(Locale.getDefault(), "%.1f", bmi));
        }
    }
}
