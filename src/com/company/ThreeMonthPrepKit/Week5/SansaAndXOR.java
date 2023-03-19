package com.company.ThreeMonthPrepKit.Week5;

import java.util.List;

public class SansaAndXOR {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-sansa-and-xor/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-five

    public static int sansaXor(List<Integer> arr) {
        int result = arr.get(0);
        for(int i = 2; i < arr.size(); i += 2){
            result ^= arr.get(i);
        }
        return arr.size() % 2 == 0 ? 0 : result;
    }
}
