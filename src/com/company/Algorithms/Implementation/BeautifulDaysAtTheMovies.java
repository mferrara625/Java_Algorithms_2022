package com.company.Algorithms.Implementation;

public class BeautifulDaysAtTheMovies {

//    https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int count = 0;
        for(int day = i; day <= j; day++){
            String temp = Integer.toString(day);
            String newString = "";
            for(int l = temp.length() - 1; l >= 0 ; l--){
                newString += temp.charAt(l);
            }
            if(Math.abs(day - (Integer.parseInt(newString))) % k == 0){
                count++;
            }
        }
        return count;
    }
}
