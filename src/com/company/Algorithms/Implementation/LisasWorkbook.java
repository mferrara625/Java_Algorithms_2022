package com.company.Algorithms.Implementation;

import java.util.List;

public class LisasWorkbook {

//    https://www.hackerrank.com/challenges/lisa-workbook/problem?isFullScreen=true

    public static int workbook(int n, int k, List<Integer> arr) {
        // Write your code here
        int pageNumber = 1;
        int result = 0;
        for(int i = 0; i < n; i++){
            System.out.println("Chapter " + (i + 1));
            for(int j = 0; j < arr.get(i) ; j++){
                System.out.println("["+(j+1)+"]");
                System.out.println("Page Number: " + pageNumber);
                if((j + 1) == pageNumber){
                    System.out.println("MAGIC!");
                    result++;
                }
                if((j + 1) % k == 0 && (j + 1) < arr.get(i)){
                    pageNumber++;
                }
            }
            pageNumber++;
        }

        return result;

    }
}
