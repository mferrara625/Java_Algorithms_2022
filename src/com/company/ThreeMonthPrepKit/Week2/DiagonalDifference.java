package com.company.ThreeMonthPrepKit.Week2;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

//        https://www.hackerrank.com/challenges/three-month-preparation-kit-diagonal-difference/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-two

        int leftToRight = 0;
        int rightToLeft = 0;

        for(int i = 0, j = arr.size() - 1; i < arr.size(); i++, j--){
            leftToRight += arr.get(i).get(i);
            rightToLeft += arr.get(j).get(i);
        }
        return Math.abs(leftToRight - rightToLeft);
    }
}
