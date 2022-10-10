package com.company.ThreeMonthPrepKit.Week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GridChallenge {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-grid-challenge/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-five

    public static String gridChallenge(List<String> grid) {
        List<String> sortedGrid = new ArrayList<>();
        for(String s : grid){
            List<Character> sorted = new ArrayList<>();
            char[] toSort = s.toCharArray();
            for(char c : toSort){
                sorted.add(c);
            }
            Collections.sort(sorted);
            String toAdd = "";
            for(char c : sorted){
                toAdd += String.valueOf(c);
            }
            sortedGrid.add(toAdd);
        }
        for(int i = 0; i < sortedGrid.size() - 1; i++){
            for(int j = 0; j < sortedGrid.get(i).length() - 1; j++){

                if(sortedGrid.get(j).charAt(i) > sortedGrid.get(j + 1).charAt(i)){
                    return "NO";
                }
            }
        }

        return "YES";
    }
}
