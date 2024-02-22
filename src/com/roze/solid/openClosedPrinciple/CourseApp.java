package com.roze.solid.openClosedPrinciple;

public class CourseApp {
    public static void main(String[] args) {
        Course course = new Course();
        course.print(new Java());
        course.print(new Spring());
    }
}
