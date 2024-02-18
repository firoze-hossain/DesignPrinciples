package com.roze.solid.singleResponsibilityPrinciple.reminder.utils;

import com.roze.solid.singleResponsibilityPrinciple.reminder.Reminder;
import com.roze.solid.singleResponsibilityPrinciple.reminder.validation.ReminderValidationChecker;

import java.util.ArrayList;
import java.util.List;

public class ReminderUtils {
    private List<Reminder> reminderList = new ArrayList<>();
    ReminderValidationChecker reminderValidationChecker=new ReminderValidationChecker();
    public void addReminder(Reminder reminder) {
        boolean isValid =reminderValidationChecker.validateReminder(reminder);
        if (!isValid) {
            throw new RuntimeException("The reminder you save set is not valid" + reminder);
        }
        getReminderList().add(reminder);
    }

    public void removeReminder(int reminderNo) {
        getReminderList().remove(--reminderNo);
    }

    public List<Reminder> getReminderList() {
        return reminderList;
    }

    public void setReminderList(List<Reminder> reminderList) {
        this.reminderList = reminderList;
    }
}
