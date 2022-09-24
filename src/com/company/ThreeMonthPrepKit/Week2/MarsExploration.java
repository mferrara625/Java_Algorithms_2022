package com.company.ThreeMonthPrepKit.Week2;

public class MarsExploration {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-mars-exploration/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-two


    public static int marsExploration(String s) {
        // Write your code here
        int sCount = 2;
        int result = 0;
        for(int i = 0; i < s.length(); i++ ){
            if(sCount == 1 || sCount == 2){
                if(s.charAt(i) != 'S')
                    result++;
            }
            else{
                if(s.charAt(i) != 'O')
                    result++;
            }

            if(sCount == 1 || sCount == 0){
                sCount++;
            }
            else{
                sCount = 0;
            }
        }
        return result;
    }
}
