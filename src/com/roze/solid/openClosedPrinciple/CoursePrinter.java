package com.roze.solid.openClosedPrinciple;

public class CoursePrinter {
    public void print(Course course) {
        if (course instanceof Java) {
            String javaCourseContent = ((Java) course).getJavaCourseContent();
            System.out.println(javaCourseContent);
        }
        if (course instanceof Spring) {
            String springCourseContent = ((Spring) course).getSpringCourseContent();
            System.out.println(springCourseContent);
        }
    }
}
