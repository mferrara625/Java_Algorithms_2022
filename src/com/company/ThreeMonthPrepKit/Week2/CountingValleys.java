package com.company.ThreeMonthPrepKit.Week2;

public class CountingValleys {


    public static int countingValleys(int steps, String path) {

//        https://www.hackerrank.com/challenges/three-month-preparation-kit-counting-valleys/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-two

        boolean isSeaLevel = true;
        int seaLevel = 0;
        int result = 0;
        for(int i = 0; i < path.length(); i++){

            if(path.charAt(i) == 'D')
                seaLevel--;
            if(path.charAt(i) == 'U')
                seaLevel++;
            if(seaLevel < 0 && isSeaLevel){
                result++;
                isSeaLevel = false;
            }
            if(seaLevel >= 0 && !isSeaLevel)
                isSeaLevel = true;
        }

        return result;

    }
}
