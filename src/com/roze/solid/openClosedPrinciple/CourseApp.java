package com.roze.solid.openClosedPrinciple;

public class CourseApp {
    public static void main(String[] args) {
        CoursePrinter coursePrinter = new CoursePrinter();
        coursePrinter.print(new Java());
    }
}
