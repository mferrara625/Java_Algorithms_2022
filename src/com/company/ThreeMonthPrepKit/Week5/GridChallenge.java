package com.company.ThreeMonthPrepKit.Week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GridChallenge {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-grid-challenge/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-five

    public static String gridChallenge(List<String> grid) {
        List<String> sortedGrid = new ArrayList<>();
        for(String s : grid){
            List<Character> charList = new ArrayList<>();
            for(char c : s.toCharArray())
                charList.add(c);
            Collections.sort(charList);
            sortedGrid.add(charList.toString());
            charList.clear();
        }
        for(int i = 0; i < sortedGrid.get(0).length(); i++){
            for(int j = 0; j < sortedGrid.size() - 1; j++){
                if(sortedGrid.get(j).charAt(i) > sortedGrid.get(j + 1).charAt(i))
                    return "NO";
            }
        }

        return "YES";
    }
}
