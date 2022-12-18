package com.company.Java.DataStructures;

import java.util.Scanner;

public class JavaSubarray {

//    https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true

    public static void javaSubarray() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        int subArr = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum < 0){
                    subArr++;
                }
            }
        }
        System.out.print(subArr);
        scan.close();
    }
}
