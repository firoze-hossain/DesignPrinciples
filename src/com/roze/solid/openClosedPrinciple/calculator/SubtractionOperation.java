package com.roze.solid.openClosedPrinciple.calculator;

public class SubtractionOperation implements Operation {
    @Override
    public int perform(int num1, int num2) {
        return num1 - num2;
    }
}
