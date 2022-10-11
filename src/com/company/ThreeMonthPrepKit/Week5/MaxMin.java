package com.company.ThreeMonthPrepKit.Week5;

import java.util.Collections;
import java.util.List;

public class MaxMin {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-angry-children/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-five

    public static int maxMin(int k, List<Integer> arr) {

        Collections.sort(arr);

        return arr.get(k - 1) - arr.get(0);

    }
}
