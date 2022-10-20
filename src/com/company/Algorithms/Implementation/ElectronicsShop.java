package com.company.Algorithms.Implementation;

public class ElectronicsShop {

//    https://www.hackerrank.com/challenges/electronics-shop/problem?isFullScreen=true

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int result = 0;

        for (int keyboard : keyboards) {
            for (int drive : drives) {
                if (keyboard + drive > result && keyboard + drive <= b) {
                    result = keyboard + drive;
                }
            }
        }
        if(result > 0)
            return result;

        return -1;
    }
}
