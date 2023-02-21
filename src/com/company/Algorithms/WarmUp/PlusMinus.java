package com.company.Algorithms.WarmUp;

import java.util.List;

public class PlusMinus {

//    https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float n= arr.size();
        float pos= 0;
        float neg =0;
        float zero=0;
        for(int i=0; i<n;i++){
            int num =arr.get(i);
            if(num>0){
                pos++;
            }
            else if(num<0){
                neg++;
            }
            else{
                zero++;
            }
        }
        System.out.println((float)(pos/n));
        System.out.println((float)(neg/n));
        System.out.println((float)(zero/n));

    }
}
