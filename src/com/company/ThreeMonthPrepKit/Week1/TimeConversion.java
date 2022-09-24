package com.company.ThreeMonthPrepKit.Week1;

public class TimeConversion {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-time-conversion/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-one

    //  48 = 0, 49= 1, 50 = 2 <- char values

    public static String timeConversion(String s) {
        char[] result = s.toCharArray();
        if(s.charAt(8) == 65){ // checks for the letter 'A'
            if(Integer.parseInt(s.substring(0, 2)) != 12)
                return s.substring(0, 8);
            result[0] = 48;
            result[1] = 48;
            return String.valueOf(result).substring(0, 8);
        }
        if(Integer.parseInt(s.substring(0, 2)) == 12)
            return s.substring(0, 8);
        result[0]++;
        result[1]++;
        result[1]++;
        return String.valueOf(result).substring(0, 8);
    }
}
