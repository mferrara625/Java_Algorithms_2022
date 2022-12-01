package com.company.Algorithms.Implementation;

public class HalloweenSale {

//    https://www.hackerrank.com/challenges/halloween-sale/problem?isFullScreen=true

    public static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int count = 0;
        while(true){
            s -= p;
            if(s < 0)
                break;
            if(p - d > m)
                p -= d;
            else
                p = m;
            count++;
        }
        return count;

    }
}
