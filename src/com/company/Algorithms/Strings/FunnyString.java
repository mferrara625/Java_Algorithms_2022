package com.company.Algorithms.Strings;

public class FunnyString {

//    https://www.hackerrank.com/challenges/funny-string/problem?isFullScreen=true

    public static String funnyString(String s) {

        for(int i = 0; i < s.length() - 1; i++){
            if(Math.abs(s.charAt(i) - s.charAt(i + 1)) !=
                    Math.abs(s.charAt(s.length() - 1 - i) - s.charAt(s.length() - 2 - i))){
                return "Not Funny";
            }

        }
        return "Funny";

    }
}
