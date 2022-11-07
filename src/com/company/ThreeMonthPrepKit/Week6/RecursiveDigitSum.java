package com.company.ThreeMonthPrepKit.Week6;

public class RecursiveDigitSum {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-recursive-digit-sum/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-six

    public static int superDigit(String n, int k) {

        if(n.length() == 1 && k == 1)
            return Integer.parseInt(n);

        long value = 0;
        for(int i = 0; i < n.length(); i++){
            value += n.charAt(i) - 48;
        }

        return superDigit(String.valueOf(value * k), 1);

    }
}
