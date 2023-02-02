package com.company.Algorithms.Search;

import java.util.ArrayList;
import java.util.List;

public class IceCreamParlor {

//    https://www.hackerrank.com/challenges/icecream-parlor/problem?isFullScreen=true

    public static List<Integer> iceCreamParlor(int m, List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++){
            for(int j = (i+1); j < arr.size(); j++){
                if(arr.get(i) + arr.get(j) == m){
                    result.add(i + 1);
                    result.add(j + 1);

                }
            }
        }

        return result;

    }
}
