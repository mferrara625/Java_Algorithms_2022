package com.company.ThreeMonthPrepKit.WeekOne;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> result = new ArrayList<>();
        int scoreMin, scoreMax = 0;

        scoreMin = scores.get(0);
        scoreMax = scores.get(0);

        int minCount = 0;
        int maxCount = 0;

        for(Integer score : scores){
            if(score < scoreMin){
                scoreMin = score;
                minCount++;
            }
            if(score > scoreMax){
                scoreMax = score;
                maxCount++;
            }
        }
        result.add(maxCount);
        result.add(minCount);
        return result;
    }
}
