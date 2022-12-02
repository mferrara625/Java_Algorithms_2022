package com.company.Algorithms.Implementation;

public class ChocolateFeast {

//    https://www.hackerrank.com/challenges/chocolate-feast/problem?isFullScreen=true

    public static int chocolateFeast(int n, int c, int m) {
        // Write your code here
        int result = n / c;
        int wrappers = result;
        while (wrappers >= m) {
            wrappers -= m;
            result++;
            wrappers++;
        }
        return result;

    }
}
