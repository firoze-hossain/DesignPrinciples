package com.roze.solid.dependencyInversionPrinciple.badDesign;

public class Calculator {
    //the calculate() method is higher level module
    public int calculate(int a,int b,String operation){
        int result=0;
        switch (operation){
            case "Add":
                //the add operation is lower level module
                //so the higher level module is dependent on lower level module
                //we have to create the object to do add operation
                AddOperation addOperation=new AddOperation();
               result= addOperation.add(a,b);

            case "Sub":
                //the sub operation is lower level module
                //so the higher level module is dependent on lower level module
                //we have to create the object to do sub operation
                SubOperation subOperation=new SubOperation();
                result=subOperation.sub(a,b);
        }
        return result;
    }
}
