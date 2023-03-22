package com.company.ThreeMonthPrepKit.Week6;

import java.util.Collections;
import java.util.List;

public class GamingArray1 {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-an-interesting-game-1/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-six

    public static String gamingArray(List<Integer> arr) {
        boolean isBobsTurn = true;
        while(!arr.isEmpty()){
            arr = arr.subList(0, arr.indexOf(Collections.max(arr)));
            isBobsTurn = !isBobsTurn;
        }

        if(isBobsTurn)
            return "ANDY";

        return "BOB";

    }
}
