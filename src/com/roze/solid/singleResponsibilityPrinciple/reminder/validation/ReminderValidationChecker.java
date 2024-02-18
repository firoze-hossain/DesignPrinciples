package com.roze.solid.singleResponsibilityPrinciple.reminder.validation;

import com.roze.solid.singleResponsibilityPrinciple.reminder.Reminder;

public class ReminderValidationChecker {
    public boolean validateReminder(Reminder reminder) {
        if (reminder.getReminderId() <= 0) {
            return false;
        }
        if (reminder.getNote().isBlank()) {//is blank will check null or empty string
            return false;
        }
        return true;
    }
}
