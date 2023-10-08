package com.example.chaeumapi.model;

public class TodoProfile {
    private String id;
    private String year;
    private String month;
    private String week;
    private String text;
    private int status;
    private int feel;

    public TodoProfile(String id, String year, String month, String week, String text, int status, int feel) {
        super();
        this.id = id;
        this.year = year;
        this.month = month;
        this.week = week;
        this.text = text;
        this.status = status;
        this.feel = feel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getFeel() { return feel; }

    public void setFeel(int feel) { this.feel = feel; }
}
