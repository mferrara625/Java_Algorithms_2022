package com.company.Java.Introduction;

import java.time.LocalDate;

public class JavaDateAndTime {

//    https://www.hackerrank.com/challenges/java-date-and-time/problem

    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().toString().toUpperCase();
    }
}
