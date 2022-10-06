package com.company.ThreeMonthPrepKit.Week4;

public class TowerBreakers {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-tower-breakers-1/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-four

    public static int towerBreakers(int n, int m) {
        if(m == 1)
            return 2;

        if(n == 1)
            return 1;

        if(n % 2 == 0)
            return 2;

        return 1;

    }
}
