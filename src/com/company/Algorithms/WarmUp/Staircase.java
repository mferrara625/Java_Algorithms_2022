package com.company.Algorithms.WarmUp;

import java.time.LocalDate;

public class Staircase {

//    https://www.hackerrank.com/challenges/staircase/problem

    public static void staircase(int n) {
        // Write your code here

        String result = "";
        for(int i = 1, j = n - 1; i <= n; i++, j--){
            for(int k = 0; k < j; k++){
                result+= " ";
            }
            for(int k = 0; k < i; k++){
                result+= "#";
            }
            result+="\n";
        }
        System.out.println(result);

    }
}
