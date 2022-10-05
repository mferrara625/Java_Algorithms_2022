package com.company.ThreeMonthPrepKit.Week5;

public class SmartNumber2 {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-smart-number/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-five

    public static boolean isSmartNumber(int num) {
        int val = (int) Math.sqrt(num);
        if((float)num / val == val)
            return true;
        return false;
    }
}
