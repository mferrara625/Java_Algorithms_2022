package com.company.ThreeMonthPrepKit.WeekOne;

public class TimeConversion {
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
