package com.company.ThreeMonthPrepKit.WeekTwo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {

    public static int lonelyInteger(List<Integer> a) {
        // Write your code here
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
