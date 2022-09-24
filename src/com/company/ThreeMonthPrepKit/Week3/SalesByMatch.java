package com.company.ThreeMonthPrepKit.Week3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {

//        https://www.hackerrank.com/challenges/three-month-preparation-kit-sock-merchant/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-three

        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < ar.size(); i++){
            if(map.get(ar.get(i)) == null){
                map.put(ar.get(i), 1);
            }
            else{
                map.put(ar.get(i), map.get(ar.get(i)) + 1);
            }
        }

        for(Integer i : map.values()){
            result += i/2;
        }
        return result;

    }
}
