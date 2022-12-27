package com.company.Algorithms.Strings;

public class CamelCase {

//    https://www.hackerrank.com/challenges/camelcase/problem?isFullScreen=true

    public static int camelcase(String s) {
        // Write your code here

        int result = 1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) <= 'Z' && s.charAt(i) >= 'A'){
                result++;
            }
        }
        return result;
    }
}
