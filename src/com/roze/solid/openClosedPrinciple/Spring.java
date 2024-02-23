package com.roze.solid.openClosedPrinciple;

public class Spring implements Course {
    public String doRegistration() {
        return "Starting the registration process of Spring Course";
    }

    public String getSpringCourseContent() {
        return "Spring Core \n" +
                "Spring mvc \n" +
                "Spring Boot\n" +
                "Spring Security";
    }
}
