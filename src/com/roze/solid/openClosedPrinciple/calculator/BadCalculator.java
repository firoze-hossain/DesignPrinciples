package com.roze.solid.openClosedPrinciple.calculator;

public class BadCalculator {
    //every time if we want to add new operation like multiplication, division,
    //we should modify class and method
    //so it violates the open closed principle
    //so this is bad code
    public int calculateNumber(int num1, int num2, String type) {
        int result = 0;
        switch (type) {
            case "sum":
                result = num1 + num2;
            case "sub":
                result = num1 - num2;
        }
        return result;

    }
}
