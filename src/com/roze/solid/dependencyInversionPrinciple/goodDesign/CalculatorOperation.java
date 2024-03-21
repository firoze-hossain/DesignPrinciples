package com.roze.solid.dependencyInversionPrinciple.goodDesign;

//this is low level  module interface
//By this interface it will be gained loosely couple between high and low level modules and abstraction as well
public interface CalculatorOperation {
    public int calculate(int a, int b);
}
