package com.company.ThreeMonthPrepKit.Week1;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {

//        https://www.hackerrank.com/challenges/three-month-preparation-kit-breaking-best-and-worst-records/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-one

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
