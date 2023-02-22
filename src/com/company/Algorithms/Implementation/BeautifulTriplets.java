package com.company.Algorithms.Implementation;

import java.util.List;

public class BeautifulTriplets {

//    https://www.hackerrank.com/challenges/beautiful-triplets/problem?isFullScreen=true

    public static int beautifulTriplets(int d, List<Integer> arr) {
        int count = 0, i = 0;
        while(i < arr.size()){
            int temp1 = arr.get(i);
            if(arr.contains(temp1+d))
            {
                int temp2 = temp1+d;
                if(arr.contains(temp2 + d))
                {
                    count++;
                }
            }
            i++;
        }
        return count;
    }
}
