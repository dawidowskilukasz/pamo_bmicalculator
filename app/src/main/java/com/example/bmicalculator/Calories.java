package com.example.bmicalculator;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class Calories extends AppCompatActivity {
    private EditText weightEditText;
    private EditText heightEditText;
    private EditText ageEditText;
    private CheckBox maleCheckBox;
    private CheckBox femaleCheckBox;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calorie_screen);

        weightEditText = findViewById(R.id.WeightNumber);
        heightEditText = findViewById(R.id.HeightNumber);
        ageEditText = findViewById(R.id.age_number);
        maleCheckBox = findViewById(R.id.gender_male_checkbox);
        femaleCheckBox = findViewById(R.id.gender_female_checkbox);
        Button calculateButton = findViewById(R.id.CalculateButton);
        resultTextView = findViewById(R.id.ResultText);
        Button backButton = findViewById(R.id.back_button);

        maleCheckBox.setOnClickListener(v -> {
            if (maleCheckBox.isChecked()) {
                femaleCheckBox.setChecked(false);
            }
        });

        femaleCheckBox.setOnClickListener(v -> {
            if (femaleCheckBox.isChecked()) {
                maleCheckBox.setChecked(false);
            }
        });

        calculateButton.setOnClickListener(v -> calculateCalories());

        backButton.setOnClickListener(v -> finish());
    }

    private void calculateCalories() {
        String weightStr = weightEditText.getText().toString();
        String heightStr = heightEditText.getText().toString();
        String ageStr = ageEditText.getText().toString();

        if (!weightStr.isEmpty() && !heightStr.isEmpty() && !ageStr.isEmpty()) {
            double weight = Double.parseDouble(weightStr);
            double height = Double.parseDouble(heightStr);
            int age = Integer.parseInt(ageStr);

            double bmr;
            if (maleCheckBox.isChecked()) {
                bmr = 5 + (10 * weight) + (6.25 * height) - (5 * age);
            } else if (femaleCheckBox.isChecked()) {
                bmr = -161 + (10 * weight) + (6.25 * height) - (5 * age);
            } else {
                return;
            }

            resultTextView.setText(String.format(Locale.getDefault(), "%.2f", bmr));
        }
    }
}