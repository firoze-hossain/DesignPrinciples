package com.roze.solid.openClosedPrinciple;

public class Hibernate implements Course {
    public String doRegistration() {
        return "Starting the registration process of Hibernate Course";
    }
    public String getHibernateCourseContent() {
        return "Hibernate Basic Concept";
    }
}
