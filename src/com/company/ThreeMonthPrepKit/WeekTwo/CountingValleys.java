package com.company.ThreeMonthPrepKit.WeekTwo;

public class CountingValleys {


    public static int countingValleys(int steps, String path) {
        // Write your code here
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
