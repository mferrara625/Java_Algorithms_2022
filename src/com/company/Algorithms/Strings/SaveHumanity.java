package com.company.Algorithms.Strings;

public class SaveHumanity {

//    https://www.hackerrank.com/challenges/save-humanity/problem?isFullScreen=true

//    Passes 7/12 Test cases

    public static void virusIndices(String p, String v) {
        String result = "";
        for(int i = 0; i <= p.length() - v.length(); i++){
            int numberOfNonMatches = 0;
            for(int j = 0, k = i; j < v.length(); j++, k++){
                if(p.charAt(k) != v.charAt(j)){
                    numberOfNonMatches++;
                    if(numberOfNonMatches > 1)
                        break;
                }
                if(j == v.length() - 1){
                    result += i + " ";
                }
            }
        }
        if(result != ""){
            System.out.println(result);
        } else {
            System.out.println("No Match!");
        }
    }
}
