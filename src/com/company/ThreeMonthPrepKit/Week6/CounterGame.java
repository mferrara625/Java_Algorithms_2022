package com.company.ThreeMonthPrepKit.Week6;

public class CounterGame {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-counter-game/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-six

    public static String counterGame(long n) {
        int turn = 0;
        while(n != 1){
            int power = (int)(Math.log(n)/Math.log(2));
            double newNum = Math.pow(2,power);
            if( newNum == n){
                n = n/2;
            }else{
                n = n - (long)newNum;
            }
            turn++;
        }
        if(turn%2 == 0){
            return "Richard";

        }else{
            return "Louise";
        }

    }
}
