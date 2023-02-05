package com.company.Algorithms.Strings;

public class TheLoveLetterMystery {

//    https://www.hackerrank.com/challenges/the-love-letter-mystery/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

    public static int theLoveLetterMystery(String s) {
        int result = 0;
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                result+= Math.abs(s.charAt(i) - s.charAt(s.length() - i - 1));
            }
        }

        return result;

    }

}
