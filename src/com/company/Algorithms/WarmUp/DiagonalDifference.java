package com.company.Algorithms.WarmUp;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int leftToRight = 0;
        int rightToLeft = 0;

        for(int i = 0, j = arr.size() - 1; i < arr.size(); i++, j--){
            leftToRight += arr.get(i).get(i);
            rightToLeft += arr.get(j).get(i);
        }
        return Math.abs(leftToRight - rightToLeft);
    }
}
