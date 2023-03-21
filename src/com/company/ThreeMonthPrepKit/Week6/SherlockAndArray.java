package com.company.ThreeMonthPrepKit.Week6;

import java.util.List;

public class SherlockAndArray {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-sherlock-and-array/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-six

    public static String balancedSums(List<Integer> arr) {

        int leftSum = arr.get(0);
        int rightSum = 0;
        for(int i = 2; i < arr.size(); i++){
            rightSum += arr.get(i);
        }
        if(arr.size() == 2 && arr.get(1) != 0 && arr.get(1) != leftSum)
            return "NO";
        if(leftSum == rightSum || rightSum == 0)
            return "YES";

        for(int i = 1; i < arr.size() - 1; i++){
            leftSum += arr.get(i);
            rightSum -= arr.get(i + 1);
            if(leftSum == rightSum)
                return "YES";
        }

        return "NO";

    }
}
