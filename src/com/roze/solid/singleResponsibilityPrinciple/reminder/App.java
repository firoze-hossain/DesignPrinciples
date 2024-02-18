package com.roze.solid.singleResponsibilityPrinciple.reminder;

import com.roze.solid.singleResponsibilityPrinciple.reminder.dao.ReminderDAO;
import com.roze.solid.singleResponsibilityPrinciple.reminder.printer.ReminderPrinter;
import com.roze.solid.singleResponsibilityPrinciple.reminder.utils.ReminderUtils;

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

        ReminderUtils reminderUtils = new ReminderUtils();
        reminderUtils.addReminder(playCricket);
        reminderUtils.addReminder(code);
        reminderUtils.addReminder(workOut);

        ReminderPrinter reminderPrinter = new ReminderPrinter();
        reminderPrinter.printReminders(reminderUtils.getReminderList());

        ReminderDAO reminderDAO = new ReminderDAO();
        reminderDAO.saveReminders(reminderUtils.getReminderList(), "test");
    }
}
