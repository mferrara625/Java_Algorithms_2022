package com.company.Algorithms.Implementation;

import java.util.ArrayList;
import java.util.List;

public class ACMICPCTeam {

//    https://www.hackerrank.com/challenges/acm-icpc-team/problem?isFullScreen=true

    public static List<Integer> acmTeam(List<String> topic) {
        List<Integer> result = new ArrayList<>();
        int max = 0;
        int currMax = 0;
        int numOfTeams = 0;
        for(int i = 0; i < topic.size() - 1; i++){
            for(int j = i + 1; j < topic.size(); j++){
                for(int k = 0; k < topic.get(i).length(); k++){
                    if(topic.get(i).charAt(k) == '1' || topic.get(j).charAt(k) == '1'){
                        currMax++;
                    }
                }
                if(currMax == max){
                    numOfTeams++;
                }
                if(currMax > max){
                    max = currMax;
                    numOfTeams = 1;
                }
                currMax = 0;
            }
        }
        result.add(max);
        result.add(numOfTeams);

        return result;

    }
}
