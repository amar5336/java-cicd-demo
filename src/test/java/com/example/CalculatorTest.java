package com.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void addPositiveNumbers() {
        Assert.assertEquals(calculator.add(2, 3), 5);
    }

    @Test
    public void addNegativeNumbers() {
        Assert.assertEquals(calculator.add(-4, -6), -10);
    }

    @Test
    public void addPositiveAndNegative() {
        Assert.assertEquals(calculator.add(10, -3), 7);
    }

    @Test
    public void addZero() {
        Assert.assertEquals(calculator.add(0, 0), 0);
        Assert.assertEquals(calculator.add(7, 0), 7);
    }
}