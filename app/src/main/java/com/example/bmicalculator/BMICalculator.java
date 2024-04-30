package com.example.bmicalculator;

public class BMICalculator {

    public static double calculateBMI(double weight, double height) {
        if (height > 0) {
            return weight / (height * height);
        }
        return 0;
    }
}
