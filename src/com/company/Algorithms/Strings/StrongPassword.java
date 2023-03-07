package com.company.Algorithms.Strings;

public class StrongPassword {

//    https://www.hackerrank.com/challenges/strong-password/problem?isFullScreen=true

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        String specialChar = "!@#$%^&*()-+";
        int count = 0;
        boolean isNum = false, isUp = false, isLow = false, isSpecial = false;

        for(int i = 0; i < n; i++){
            char ch = password.charAt(i);
            if(Character.isDigit(ch)) isNum = true;
            else if(Character.isUpperCase(ch)) isUp = true;
            else if(Character.isLowerCase(ch)) isLow = true;
            else if(specialChar.indexOf(ch) >= 0) isSpecial = true;
        }

        if(!isNum) count++;
        if(!isUp) count++;
        if(!isLow) count++;
        if(!isSpecial) count++;

        return Math.max(count, 6 - n);

    }
}
