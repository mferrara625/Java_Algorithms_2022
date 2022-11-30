package com.company.Algorithms.Implementation;

public class SherlockAndSquares {

//    https://www.hackerrank.com/challenges/sherlock-and-squares/problem?isFullScreen=true

    public static int squares(int a, int b) {

        int count = 0;

        for(int i = (int)Math.sqrt(b); i >= (int)Math.sqrt(a); i--){
            if((i * i) <= b && (i * i) >= a)
                count++;
        }

        return count;

    }
}
