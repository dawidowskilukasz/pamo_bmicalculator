package com.example.bmicalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class BMICalculatorTest {

    @Test
    public void testCalculateBMI() {
        double weight = 80;
        double height = 180;
        double expectedBMI = 24.69;
        double actualBMI = BMICalculator.calculateBMI(weight, height/100);
        assertEquals(expectedBMI, actualBMI, 0.01);
    }
}
