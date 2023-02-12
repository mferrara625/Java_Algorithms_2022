package com.company.Algorithms.Implementation;

import java.util.List;

public class MinimumDistances {

//    https://www.hackerrank.com/challenges/minimum-distances/problem?isFullScreen=true

    public static int minimumDistances(List<Integer> a) {
        int minDist = a.size();   /* initialize minDist to size of list */

        for(int i = 0; i < a.size(); i++){
            for(int j = (i + 1); j < a.size(); j++){

                if(a.get(j) - a.get(i) == 0){ /* compares each number in the list, one at a time, to all the succeeding numbers in the list and looks for a match*/

                    if((j - i) < minDist){
                        minDist = (j - i);
                        if(minDist == 1)                /* Not sure if this optimizes code or not , makes it return faster if minDistance is found early but also adds extra step to every iteration*/
                            return 1;
                        break;
                    }
                }
            }
        }

        if(minDist < a.size())
            return minDist;

        return -1;

    }
}
