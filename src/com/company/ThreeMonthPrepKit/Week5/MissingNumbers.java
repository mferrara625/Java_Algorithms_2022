package com.company.ThreeMonthPrepKit.Week5;

import java.util.*;

public class MissingNumbers {




    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        Map<Integer, Integer> freqA = new HashMap<>();
        Map<Integer, Integer> freqB = new HashMap<>();

        Set<Integer> holder = new HashSet<>();
        for(int i =0; i < brr.size(); i++){
            if(!arr.contains(brr.get(i))){
                holder.add(brr.get(i));
            }
            if(freqB.get(brr.get(i)) == null){
                freqB.put(brr.get(i), 1);
            } else {
                freqB.put(brr.get(i), freqB.get(brr.get(i)) + 1);
            }
            if(i >= arr.size())
                continue;
            if(freqA.get(arr.get(i)) == null){
                freqA.put(arr.get(i), 1);
            } else {
                freqA.put(arr.get(i), freqA.get(arr.get(i)) + 1);
            }
        }
        for(int i : freqA.keySet()){
            if(freqA.get(i) < freqB.get(i))
                holder.add(i);
        }
        List<Integer> result = new ArrayList<>(holder);
        Collections.sort(result);
        return result;
    }
}
