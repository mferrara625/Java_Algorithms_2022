package com.company.ThreeMonthPrepKit.Week3;

import java.util.List;

public class SubArrayDivision2 {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-the-birthday-bar/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-three

    public static int birthday(List<Integer> s, int d, int m) {
        int result = 0;
        if(s.size() == 1 && s.get(0) == d)
            return 1;

        for(int i = 0; i < s.size() - m + 1; i++){
            int segment = 0;
            for(int j = i; j < (i + m); j++){
                segment += s.get(j);
            }
            if(segment == d)
                result++;
        }
        return result;
    }
}
