package com.roze.solid.singleResponsibilityPrinciple.reminder.dao;

import com.roze.solid.singleResponsibilityPrinciple.reminder.Reminder;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;

public class ReminderDAO {
    public void saveReminders(List<Reminder> reminderList, String fileName) {
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
}
