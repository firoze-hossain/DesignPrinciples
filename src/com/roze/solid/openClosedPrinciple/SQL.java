package com.roze.solid.openClosedPrinciple;

public class SQL implements Course {
    public String doRegistration() {
        return "Starting the registration process of SQL Course";
    }

    public String getSQLCourseContent() {
        return "Indexing\n" +
                "Joining\n" +
                "function";
    }
}
