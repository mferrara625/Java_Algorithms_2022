package com.company.ThreeMonthPrepKit.Week2;

public class FlippingBits {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-flipping-bits/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-two

    public static long flippingBits(long n) {
        int a = (int) n;
        String str = Integer.toBinaryString(~a);
        return Long.parseLong(str, 2);
    }
}
