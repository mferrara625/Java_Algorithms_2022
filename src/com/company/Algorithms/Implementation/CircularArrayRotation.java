package com.company.Algorithms.Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CircularArrayRotation {

//    https://www.hackerrank.com/challenges/circular-array-rotation/problem?isFullScreen=true

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        if(k > a.size())
            k = k % a.size();
        List<Integer> result = new ArrayList<>();
        List<Integer> holder = new ArrayList<>();
        for(int i = 0; i < k; i++){
            holder.add(a.remove(a.size() - 1));
        }
        Collections.reverse(holder);
        holder.addAll(a);
        for(Integer i : queries){
            result.add(holder.get(i));
        }

        return result;
    }
}
