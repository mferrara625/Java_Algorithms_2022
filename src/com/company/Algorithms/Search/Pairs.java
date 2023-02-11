package com.company.Algorithms.Search;

import java.util.Collections;
import java.util.List;

public class Pairs {

//    https://www.hackerrank.com/challenges/pairs/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

    public static int pairs(int k, List<Integer> arr) {
        Collections.sort(arr);
        int res = 0;
        for(int i = 0; i < arr.size() - 1; i++){
            for(int j = (i + 1); j < arr.size(); j++){
                if(Math.abs(arr.get(j) - arr.get(i)) == k){
                    res++;
                }
                if(Math.abs(arr.get(j) - arr.get(i)) > k){
                    break;
                }
            }
        }
        return res;
    }
}
