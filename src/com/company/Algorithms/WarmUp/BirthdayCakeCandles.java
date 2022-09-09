package com.company.Algorithms.WarmUp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int maxNumber = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for(Integer i : candles){
            if(i > maxNumber)
                maxNumber = i;
            if(freq.get(i) == null){
                freq.put(i, 1);
            } else {
                freq.put(i, (freq.get(i) + 1));
            }
        }
        return freq.get(maxNumber);
    }

}
