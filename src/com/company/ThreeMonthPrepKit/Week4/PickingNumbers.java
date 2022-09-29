package com.company.ThreeMonthPrepKit.Week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-picking-numbers/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-four

    public static int pickingNumbers(List<Integer> a) {
        int count = 0;
        List<Integer> result = new ArrayList<>();
        Collections.sort(a);
        result.add(a.get(0));
        for(int i = 1; i < a.size(); i++){
            if((Math.abs(a.get(i) - result.get(result.size() - 1 )) <= 1) && (Math.abs(a.get(i) - result.get(0)) <= 1)){
                result.add(a.get(i));
            }
            else{
                if(result.size() > count)
                    count = result.size();
                result.clear();
                result.add(a.get(i));
            }
        }
        if(result.size() > count)
            count = result.size();

        return count;
    }
}
