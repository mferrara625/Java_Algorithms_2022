package com.company.Algorithms.Implementation;

public class CatsAndAMouse {

//    https://www.hackerrank.com/challenges/cats-and-a-mouse/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

    static String catAndMouse(int x, int y, int z) {
        if(Math.abs(x - z) < Math.abs(y - z)){
            return "Cat A";
        } else if(Math.abs(x - z) > Math.abs(y - z)){
            return "Cat B";
        } else {
            return "Mouse C";
        }

    }

}
