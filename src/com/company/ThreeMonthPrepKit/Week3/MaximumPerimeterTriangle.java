package com.company.ThreeMonthPrepKit.Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumPerimeterTriangle {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-maximum-perimeter-triangle/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-three

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        Collections.sort(sticks);
        List<Integer> mpList = new ArrayList<>();
        List<Integer> negOne = new ArrayList<>();
        negOne.add(-1);

        long result = 0;
        long currentPerimeter = 0;
        mpList.add(0);
        mpList.add(0);
        mpList.add(0);

        for(int i = 0; i < sticks.size() - 2; i++){
            if((sticks.get(i) + sticks.get(i + 1)) > sticks.get(i + 2)){
                currentPerimeter = (long)sticks.get(i) + sticks.get(i + 1) + sticks.get(i + 2);
                mpList.set(0, sticks.get(i));
                mpList.set(1, sticks.get(i + 1));
                mpList.set(2, sticks.get(i + 2));

            }
            if(currentPerimeter > result){
                result = currentPerimeter;
            }
            currentPerimeter = 0;
        }

        if(result == 0)
            return negOne;

        return mpList;

    }
}
