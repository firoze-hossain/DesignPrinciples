package com.roze.solid.openClosedPrinciple.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Operation operation = new AdditionOperation();
        int result = calculator.calculateNumber(10, 5, operation);
        System.out.println(result);
    }
}
