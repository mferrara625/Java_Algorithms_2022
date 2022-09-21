package com.company.ThreeMonthPrepKit.WeekTwo;

public class MarsExploration {


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
