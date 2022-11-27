package com.company.Algorithms.Implementation;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualizeTheArray {

//    https://www.hackerrank.com/challenges/equality-in-a-array/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

    public static int equalizeArray(List<Integer> arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i : arr){
            if(freq.get(i) == null) {
                freq.put(i, 1);
            } else {
                freq.put(i, freq.get(i) + 1);
            }
        }
        return arr.size() - Collections.max(freq.values());

    }
}
