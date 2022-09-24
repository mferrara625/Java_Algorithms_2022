package com.company.ThreeMonthPrepKit.Week3;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BetweenTwoSets {

//      Week 3 Mock Interview Question
//    https://www.hackerrank.com/challenges/between-two-sets/problem

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // check for factors from list a up to the smallest number in list b
        int result = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        Collections.sort(b);
        for(int i = 0; i < a.size(); i++){
            for(int j = 1; j <= b.get(0); j++){
                if(j % a.get(i) == 0){
                    if(freq.get(j) == null){
                        freq.put(j, 1);
                    } else {
                        freq.put(j, freq.get(j) + 1);
                    }
                }
            }
        }
        // see which of those factors are factors of list b
        for (Map.Entry<Integer,Integer> mapElement : freq.entrySet()) {
            int key = mapElement.getKey();

            int value = (mapElement.getValue());

            if(value == a.size()){
                int count = 0;

                for(int i = 0; i < b.size(); i++){
                    if(b.get(i) % key == 0){
                        count++;
                    }
                }
                if(count == b.size()){
                    result++;
                }
            }
        }

        return result;
    }
}
