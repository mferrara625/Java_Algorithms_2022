package com.company.Java.DataStructures;

import java.util.ArrayList;
import java.util.List;

public class Java2DArray {

//    https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true

    public void java2DArray(){

        List<List<Integer>> arr = new ArrayList<>();
//    } catch (IOException ex) {
//        throw new RuntimeException(ex);
//    }
//});

        int tempMax = 0;
        int trueMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size() - 2; i++){
        for(int j = 0; j < arr.get(i).size() - 2; j++){

        tempMax += arr.get(i).get(j);
        tempMax += arr.get(i).get(j + 1);
        tempMax += arr.get(i).get(j + 2);

        tempMax += arr.get(i + 1).get(j + 1);

        tempMax += arr.get(i + 2).get(j);
        tempMax += arr.get(i + 2).get(j + 1);
        tempMax += arr.get(i + 2).get(j + 2);

        if(tempMax > trueMax)
            trueMax = tempMax;

        tempMax = 0;
        }

        }

        System.out.println(trueMax);

//        bufferedReader.close();
    }
}
