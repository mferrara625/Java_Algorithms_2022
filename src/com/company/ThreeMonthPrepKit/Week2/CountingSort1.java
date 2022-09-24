package com.company.ThreeMonthPrepKit.Week2;

import java.util.ArrayList;
import java.util.List;

public class CountingSort1 {

    public static List<Integer> countingSort(List<Integer> arr) {

//        https://www.hackerrank.com/challenges/three-month-preparation-kit-countingsort1/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-two

        List<Integer> freq = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            freq.add(0);
        }
        for(Integer i : arr){
            freq.set(i, freq.get(i) + 1);
        }
        return freq;
    }

}
