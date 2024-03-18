package com.roze.solid.openClosedPrinciple.calculator;

public class AdditionOperation implements Operation {
    @Override
    public int perform(int num1, int num2) {
        return num1 + num2;
    }
}
