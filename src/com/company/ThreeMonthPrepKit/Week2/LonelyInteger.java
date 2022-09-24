package com.company.ThreeMonthPrepKit.Week2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {

    public static int lonelyInteger(List<Integer> a) {

//        https://www.hackerrank.com/challenges/three-month-preparation-kit-lonely-integer/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-two

        int result = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for(Integer i : a){
            if(freq.get(i) == null){
                freq.put(i, 1);
            }
            else{
                freq.put(i, freq.get(i) + 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: freq.entrySet()) {
            if(entry.getValue() == 1)
                result = entry.getKey();


        }
        return result;

    }
}
