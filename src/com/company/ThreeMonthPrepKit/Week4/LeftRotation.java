package com.company.ThreeMonthPrepKit.Week4;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-array-left-rotation/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-four

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for(int i = d; i < arr.size(); i++){
            result.add(arr.get(i));
        }
        for(int i = 0; i < d; i++){
            result.add(arr.get(i));
        }
        return result;
    }
}
