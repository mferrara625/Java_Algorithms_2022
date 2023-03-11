package com.company.Java.DataStructures;

import java.util.HashSet;
import java.util.Set;

public class JavaHashset {

//    https://www.hackerrank.com/challenges/java-hashset/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

    int t = 0;
    String[] pair_right, pair_left;

    public void javaHashset() {
        //Write your code here
        Set<String> stringSet = new HashSet<>();

        for (int i = 0; i < t; i++) {
            stringSet.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(stringSet.size());
        }
    }
}
