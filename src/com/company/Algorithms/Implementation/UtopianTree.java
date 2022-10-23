package com.company.Algorithms.Implementation;

public class UtopianTree {

//    https://www.hackerrank.com/challenges/utopian-tree/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

    public static int utopianTree(int n) {

        int result = 1;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0)
                result = result * 2;
            else
                result++;
        }
        return result;
    }
}
