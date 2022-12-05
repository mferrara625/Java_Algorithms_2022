package com.company.Algorithms.Implementation;

import java.util.List;

public class CavityMap {

//    https://www.hackerrank.com/challenges/cavity-map/problem?isFullScreen=true

    public static List<String> cavityMap(List<String> grid) {
        // Write your code here
        for(int i = 1; i < grid.size() - 1; i++){
            for(int j = 1; j < grid.get(i).length() - 1; j++){
                if(grid.get(i).charAt(j) > grid.get(i - 1).charAt(j) && grid.get(i).charAt(j) > grid.get(i).charAt(j - 1) && grid.get(i).charAt(j) > grid.get(i).charAt(j + 1) && grid.get(i).charAt(j) > grid.get(i + 1).charAt(j)){
                    String update = "";
                    for(int k = 0; k < grid.get(i).length(); k++){
                        if(k == j)
                            update += "X";
                        else{
                            update += grid.get(i).charAt(k);
                        }
                    }

                    grid.set(i, update);
                }
            }
        }
        return grid;
    }
}
