package com.roze.solid.dependencyInversionPrinciple.goodDesign;

//low level  module
public class AddOperation implements CalculatorOperation {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
