package com.company.Algorithms.Implementation;

public class RepeatedString {

//    https://www.hackerrank.com/challenges/repeated-string/problem?isFullScreen=true

    public static long repeatedString(String s, long n) {
        // Write your code here
        long result = 0;
        int counter = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a')
                counter++;
        }
        if(n % s.length() == 0)
            return counter * (n / s.length());
        else{
            result = counter * (n / s.length());
            long remainder = n % s.length();
            for(int i = 0; i < remainder; i++){
                if(s.charAt(i) == 'a')
                    result++;
            }
        }
        return result;
    }
}
