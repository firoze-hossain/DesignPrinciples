package com.roze.solid.singleResponsibilityPrinciple.reminder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reminder {
    private int reminderId;
    private String note;
    private LocalDateTime time;
    private List<Reminder> reminderList = new ArrayList<>();

    public Reminder() {
    }

    public Reminder(int reminderId, String note, LocalDateTime time) {
        this.reminderId = reminderId;
        this.note = note;
        this.time = time;
    }

    public void addReminder(Reminder reminder) {
        boolean isValid = reminder.validateReminder(reminder);
        if (!isValid) {
            throw new RuntimeException("The reminder you save set is not valid" + reminder);
        }
        reminderList.add(reminder);
    }

    public void printReminders() {
        reminderList.forEach(reminder -> System.out.println(reminder));
    }

    public void removeReminder(int reminderNo) {
        reminderList.remove(--reminderNo);
    }

    public void saveReminders(String fileName) {
        //using try resources
        //we don't need to close printStream()
        try (PrintStream printStream = new PrintStream("/home/firoze/Documents/notes/" + fileName)) {
            reminderList.forEach(reminder -> printStream.println(reminder));
        }

//        try {
//            PrintStream printStream = new PrintStream("/home/firoze/Documents/notes/" + fileName);
//            reminderList.forEach(reminder -> printStream.println(reminder));
//            printStream.close();
        // }
        catch (FileNotFoundException e) {
            System.out.println("File name is not valid! Please provide valid file name");
        }

    }

    public boolean validateReminder(Reminder reminder) {
        if (reminder.getReminderId() <= 0) {
            return false;
        }
        if (reminder.getNote().isBlank()) {//is blank will check null or empty string
            return false;
        }
        return true;
    }

    public int getReminderId() {
        return reminderId;
    }

    public void setReminderId(int reminderId) {
        this.reminderId = reminderId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Reminder[" +
                "reminderId=" + reminderId +
                ", note='" + note + '\'' +
                ", time=" + time +
                ']';
    }
}
