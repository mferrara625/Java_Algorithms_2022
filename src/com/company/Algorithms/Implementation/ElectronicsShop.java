package com.company.Algorithms.Implementation;

public class ElectronicsShop {

//    https://www.hackerrank.com/challenges/electronics-shop/problem?isFullScreen=true

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int result = 0;
        for(int i = 0; i < keyboards.length; i++){
            for(int j = 0; j < drives.length; j++){
                if(keyboards[i] + drives[j] > result && keyboards[i] + drives[j] <= b){
                    result = keyboards[i] + drives[j];
                }
            }
        }
        if(result > 0)
            return result;

        return -1;
    }
}
