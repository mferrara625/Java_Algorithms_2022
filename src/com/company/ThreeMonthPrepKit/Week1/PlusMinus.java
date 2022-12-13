package com.company.ThreeMonthPrepKit.Week1;

import java.util.List;

public class PlusMinus {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-plus-minus/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-one

    public static void plusMinus(List<Integer> arr) {
        float res1= 0.6f;
        float res2 =0.6f;
        float res3 = 0.6f;
        int c1=0, c2=0, c3=0;
        for(int i:arr)
        {
            if(i>0)
            {
                c1++;
            }
            if(i<0)
            {
                c2++;
            }
            if(i==0)
            {
                c3++;
            }
        }
        float n = arr.size();
        res1 = c1/n;
        res2 = c2/n;
        res3 = c3/n;
        System.out.println(res1+"\n"+res2+"\n"+res3);
    }
}
