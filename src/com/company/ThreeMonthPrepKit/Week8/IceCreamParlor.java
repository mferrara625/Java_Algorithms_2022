package com.company.ThreeMonthPrepKit.Week8;

import java.util.ArrayList;
import java.util.List;

public class IceCreamParlor {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-icecream-parlor/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-eight

    public static List<Integer> iceCreamParlor(int m, List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i < arr.size(); i++){
            for(int j = 0; j < i; j++){
                if(arr.get(j) + arr.get(i) == m){
                    result.add(j + 1);
                    result.add(i + 1);
                    break;
                }

            }
        }
        return result;
    }
}
