package com.company.ThreeMonthPrepKit.Week5;

import java.util.Collections;
import java.util.List;

public class MaxMin {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-angry-children/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-five

    public static int maxMin(int k, List<Integer> arr) {

        Collections.sort(arr);
        int result = arr.get(arr.size() - 1);

        for(int i = 0, j = k - 1; i < arr.size() - (k - 1); i++, j++){
            if((arr.get(j) - arr.get(i)) < result)
                result = (arr.get(j) - arr.get(i));
        }

        return result;

    }
}
