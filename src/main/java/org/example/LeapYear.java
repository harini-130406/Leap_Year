package org.example;

public class LeapYear {

    public boolean isLeapYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Invalid year");
        }

        return (year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0);
    }
}