package com.company.Algorithms.Implementation;

public class SaveThePrisoner {

//    https://www.hackerrank.com/challenges/save-the-prisoner/problem?isFullScreen=true

//    **Reformatted to reduce repetition***
    public static int saveThePrisoner(int n, int m, int s) {
        // Write your code here

        int checkM = (s - 1) + (m <= n ? m : m % n);
        int result = checkM > n ? checkM % n : checkM;
        return result > 0 ? result : n;

    }

//    ***ORIGINAL***
//    public static int saveThePrisoner(int n, int m, int s) {
//        // Write your code here
//
//        return (((s - 1) + (m <= n ? m : m % n)) > n ? ((s - 1) + (m <= n ? m : m % n)) % n : ((s - 1) + (m <= n ? m : m % n))) > 0 ? ((s - 1) + (m <= n ? m : m % n)) > n ? ((s - 1) + (m <= n ? m : m % n)) % n : ((s - 1) + (m <= n ? m : m % n)) : n;
//
//    }
}
