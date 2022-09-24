package com.company.ThreeMonthPrepKit.Week3;

import java.util.HashMap;
import java.util.List;

public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {

//        https://www.hackerrank.com/challenges/three-month-preparation-kit-migratory-birds/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-three

        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int result = 0;
        for(Integer type: arr){
            if(map.get(type) == null){
                map.put( type, 1);
            }
            else {
                map.put(type, map.get(type) + 1);
            }
            System.out.println(map.toString());

        }
        for(int i = arr.size() - 1; i > 0; i--){
            if(map.containsKey(i)){
                if(map.get(i) >= max){
                    max = map.get(i);
                    result = i;
                }
            }
        }
        return result;

    }
}
