package com.company.Algorithms.Implementation;

import java.util.List;

public class AngryProfessor {

//    https://www.hackerrank.com/challenges/angry-professor/problem

    public static String angryProfessor(int k, List<Integer> a) {

        int count = 0;
        for(int i : a){
            if (i <= 0)
                count++;
        }
        if(count >= k)
            return "NO";

        return "YES";

    }
}
