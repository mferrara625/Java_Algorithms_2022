package com.company.ThreeMonthPrepKit.Week6;

public class SumVsXOR {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-sum-vs-xor/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-six&h_r=next-challenge&h_v=zen

    public static long sumXor(long n) {
        // Write your code here
        if(n == 0)
            return 1;
        long result = 0;
        for(long i = 0; i < n; i++){
            if((n + i) == (n ^ i)){
                result++;
            }
        }
        return result;
    }
}
