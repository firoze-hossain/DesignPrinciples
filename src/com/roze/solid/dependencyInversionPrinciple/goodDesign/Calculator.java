package com.roze.solid.dependencyInversionPrinciple.goodDesign;

public class Calculator {
    //this is higher level module
    //it does not depend on lower level module like sub,add,mul etc
    //we don't have to create any object of add or sub o mul etc
    //we have have provide the interface it self
    //so when we call the method just to provide what operation we need(like subOperation or multiplication operation)
    public int calculate(int a, int b, CalculatorOperation operation) {
        return operation.calculate(a, b);
    }
}
