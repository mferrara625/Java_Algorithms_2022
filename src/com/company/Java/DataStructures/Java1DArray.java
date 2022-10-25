package com.company.Java.DataStructures;

import java.util.Scanner;

public class Java1DArray {



    public class Solution {

//        https://www.hackerrank.com/challenges/java-1d-array-introduction/problem

        public static void java1DArray() {

            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = scan.nextInt();
            }
            scan.close();

            // Prints each sequential element in array a
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }
}
