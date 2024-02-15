package com.roze.solid.singleResponsibilityPrinciple.reminder;

import java.time.LocalDateTime;

public class Reminder {
    private int reminderId;
    private String note;
    private LocalDateTime time;

    public Reminder() {
    }

    public Reminder(int reminderId, String note, LocalDateTime time) {
        this.reminderId = reminderId;
        this.note = note;
        this.time = time;
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
}
