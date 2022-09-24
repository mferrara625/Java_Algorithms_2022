package com.company.ThreeMonthPrepKit.Week3;

public class DrawingBook {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-drawing-book/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-three

    public static int pageCount(int n, int p) {

        if(n % 2 == 0)
            n++;
        if(p % 2 == 0)
            p++;

        int frontCount = (p - 1) / 2;
        int backCount = (n - p) / 2;

        if(frontCount < backCount)
            return frontCount;

        return backCount;
    }

}
