package com.roze.solid.openClosedPrinciple;

public class CourseApp {
    public static void main(String[] args) {
        CoursePrinter coursePrinter = new CoursePrinter();
        RegistrationHelper registrationHelper = new RegistrationHelper();
        //coursePrinter.print(new Java());
       // registrationHelper.register(new Java());
        coursePrinter.print(new Spring());
        registrationHelper.register(new Spring());

    }
}
