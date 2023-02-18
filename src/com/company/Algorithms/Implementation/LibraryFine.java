package com.company.Algorithms.Implementation;

public class LibraryFine {

//    https://www.hackerrank.com/challenges/library-fine/problem?isFullScreen=true

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here
        int fine = 0;
        if(y1>y2) fine = 10000;
        else if(y1==y2){
            if(m1 == m2 && d1 > d2) fine = 15 * (d1 - d2);
            else if(m1 > m2) fine = 500 * (m1 - m2);
        }
        return fine;
    }
}
