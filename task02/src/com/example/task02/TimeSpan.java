package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalize();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
        normalize();
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        normalize();
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
        normalize();
    }

    private void normalize() {
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds %= 60;
        }

        if (minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
        }

    }

    public void add(TimeSpan time) {
        this.seconds += time.seconds;
        this.minutes += time.minutes;
        this.hours += time.hours;
    }

    public void subtract(TimeSpan time) {
        this.seconds -= time.seconds;
        this.minutes -= time.minutes;
        this.hours -= time.hours;
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
