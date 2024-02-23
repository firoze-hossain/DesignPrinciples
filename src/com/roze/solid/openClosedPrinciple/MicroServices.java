package com.roze.solid.openClosedPrinciple;

public class MicroServices implements Course {
    public String doRegistration() {
        return "Starting the registration process of MicroServices Course";
    }
    public String getMicroServicesCourseContent() {
        return "Deep dive into MicroServices for 20 hours";
    }
}
