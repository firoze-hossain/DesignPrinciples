package com.roze.solid.singleResponsibilityPrinciple.reminder;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        Reminder reminder = new Reminder();
        Reminder playCricket = new Reminder(101, "playing cricket",
                LocalDateTime.of(2024, 02, 17, 10, 15));
        Reminder code = new Reminder(102, "Coding",
                LocalDateTime.of(2024, 02, 17, 8, 00));
        Reminder workOut = new Reminder(103, "Work out for 2 hours",
                LocalDateTime.of(2024, 02, 17, 5, 30));

        reminder.addReminder(playCricket);
        reminder.addReminder(code);
        reminder.addReminder(workOut);
        reminder.printReminders();

//        reminder.removeReminder(1);
//        System.out.println("*********After removing reminder**********");
//        reminder.printReminders();
        reminder.saveReminders("friday");
    }
}
