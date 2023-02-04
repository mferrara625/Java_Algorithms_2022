package com.company.Algorithms.Strings;

public class AlternatingCharacters {

//    https://www.hackerrank.com/challenges/alternating-characters/problem?isFullScreen=true

    public static int alternatingCharacters(String s) {
        int result = 0;

        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                result++;
            }
        }

        return result;
    }
}
