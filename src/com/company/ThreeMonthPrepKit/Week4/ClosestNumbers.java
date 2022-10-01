package com.company.ThreeMonthPrepKit.Week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-closest-numbers/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-four

    public static List<Integer> closestNumbers(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        Collections.sort(arr);
        int minimumDiff = arr.get(arr.size() - 1);

        for(int i = 0; i < arr.size() - 1; i++){
            if(Math.abs(arr.get(i) - arr.get(i + 1)) < minimumDiff)
                minimumDiff = Math.abs(arr.get(i) - arr.get(i + 1));
        }
        for(int i = 0; i < arr.size() - 1; i++){
            if(Math.abs(arr.get(i) - arr.get(i + 1)) == minimumDiff){
                result.add(arr.get(i));
                result.add(arr.get(i + 1));
            }
        }
        Collections.sort(result);
        return result;
    }
}
