package com.roze.solid.openClosedPrinciple;

public class Java implements Course {
    public String doRegistration() {
        return "Starting the registration process of Java Course";
    }
    public String getJavaCourseContent() {
        return "Java File Handling \n" +
                "Java Collection \n" +
                "Java Stream API \n" +
                "Java Concurrency";
    }
}
