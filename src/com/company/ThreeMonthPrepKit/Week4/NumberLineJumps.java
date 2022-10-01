package com.company.ThreeMonthPrepKit.Week4;

public class NumberLineJumps {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-kangaroo/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-four

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        for(int i = 0; i < 10000; i++){
            if((x1 += v1) == (x2 += v2))
                return "YES";
        }
        return "NO";
    }
}
