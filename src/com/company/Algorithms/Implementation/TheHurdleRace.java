package com.company.Algorithms.Implementation;

import java.util.Collections;
import java.util.List;

public class TheHurdleRace {

//    https://www.hackerrank.com/challenges/the-hurdle-race/problem?isFullScreen=true

    public static int hurdleRace(int k, List<Integer> height) {

        if(Collections.max(height) - k > 0)
            return Collections.max(height) - k;

        return 0;

    }
}
