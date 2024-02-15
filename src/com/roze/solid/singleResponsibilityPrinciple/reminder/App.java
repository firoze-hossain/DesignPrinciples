package com.roze.solid.singleResponsibilityPrinciple.reminder;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        Reminder reminder = new Reminder(101, "Play Cricket",
                LocalDateTime.of(2024, 02, 17, 10, 15));
        Reminder reminder1 = new Reminder(102, "Coding",
                LocalDateTime.of(2024, 02, 17, 8, 00));
    }
}
