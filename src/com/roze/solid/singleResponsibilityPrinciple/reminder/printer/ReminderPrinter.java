package com.roze.solid.singleResponsibilityPrinciple.reminder.printer;

import com.roze.solid.singleResponsibilityPrinciple.reminder.Reminder;

import java.util.List;

public class ReminderPrinter {
    public void printReminders(List<Reminder> reminderList) {
        reminderList.forEach(reminder -> System.out.println(reminder));
    }
}
