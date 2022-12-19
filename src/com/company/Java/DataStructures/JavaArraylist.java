package com.company.Java.DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {

//    https://www.hackerrank.com/challenges/java-arraylist/problem

    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int size = scanner.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < array.length; j++) {
                array[j] = scanner.nextInt();
            }
            list.add(array);
        }
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int j = scanner.nextInt();
            int k = scanner.nextInt();
            try {
                System.out.println(list.get(j - 1)[k - 1]);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
