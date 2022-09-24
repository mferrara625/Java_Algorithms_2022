package com.company.ThreeMonthPrepKit.Week1;

import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-mini-max-sum/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-one

    public static void miniMaxSum(List<Integer> arr) {
        long sum = 0;
        Collections.sort(arr);
        for(Integer i : arr){
            sum += i;
        }
        System.out.println(sum - arr.get(4) + " " + (sum - arr.get(0)));

    }
}
