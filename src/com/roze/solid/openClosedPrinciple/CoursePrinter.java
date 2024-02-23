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
        if (course instanceof Hibernate) {
            String hibernateCourseContent = ((Hibernate) course).getHibernateCourseContent();
            System.out.println(hibernateCourseContent);
        }
        if (course instanceof MicroServices) {
            String microServicesCourseContent = ((MicroServices) course).getMicroServicesCourseContent();
            System.out.println(microServicesCourseContent);
        }
        if (course instanceof SQL) {
            String sqlCourseContent = ((SQL) course).getSQLCourseContent();
            System.out.println(sqlCourseContent);
        }
    }
}
