package com.company.Algorithms.Implementation;

public class FindDigits {

//    https://www.hackerrank.com/challenges/find-digits/problem?isFullScreen=true

    public static int findDigits(int n) {
        // Write your code here
        int result = 0;
        int num = n;
        while(num > 0){
            int d = num % 10;
            if( d != 0 && n % d == 0){
                result++;
            }
            num /= 10;
        }

        return result;

    }
}
