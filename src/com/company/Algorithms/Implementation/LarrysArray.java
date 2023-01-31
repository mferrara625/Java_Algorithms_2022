package com.company.Algorithms.Implementation;

import java.util.List;

public class LarrysArray {

//    https://www.hackerrank.com/challenges/larrys-array/problem?isFullScreen=true

    public static String larrysArray(List<Integer> A) {
        for(int i = 0; i <= A.size() - 3; i++){
            if(A.get(i) > A.get(i + 1) || A.get(i) > A.get(i + 2)){
                int temp = A.get(i);
                A.set(i, A.get(i + 1));
                A.set(i + 1, A.get(i + 2));
                A.set(i + 2, temp);

                i = -1;
            }
        }
        for(int i = 0; i < A.size() - 1; i++){
            if(A.get(i) > A.get(i + 1))
                return "NO";
        }

        return "YES";

    }

}
