package com.roze.solid.openClosedPrinciple;

public class Course {
    public void print(Java java) {
        System.out.println(java.getJavaCourseContent());
    }

    public void print(Spring spring) {
        System.out.println(spring.getSpringCourseContent());
    }

    public void print(Hibernate hibernate) {
        System.out.println(hibernate.getHibernateCourseContent());
    }


}
