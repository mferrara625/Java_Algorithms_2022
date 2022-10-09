package com.company.ThreeMonthPrepKit.Week5;

public class StrongPassword {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-strong-password/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-five

    public static int minimumNumber(int n, String password) {

        if(password.length() == 0)
            return 6;

        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";
        boolean hasNumber = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;
        int conditionsMet = 0;
        for(int i = 0; i < password.length(); i++){

            if(numbers.contains(String.valueOf(password.charAt(i)))){
                hasNumber = true;
            }
            if(lower_case.contains(String.valueOf(password.charAt(i)))){
                hasLower = true;
            }
            if(upper_case.contains(String.valueOf(password.charAt(i)))){
                hasUpper = true;
            }
            if(special_characters.contains(String.valueOf(password.charAt(i)))){
                hasSpecial = true;
            }

        }
        if(hasNumber)
            conditionsMet++;
        if(hasLower)
            conditionsMet++;
        if(hasUpper)
            conditionsMet++;
        if(hasSpecial)
            conditionsMet++;
        if(password.length() < 6){
            if((6 - password.length()) + conditionsMet < 4)
                return 4 - conditionsMet;
            else
                return 6 - password.length();
        }
        else{
            conditionsMet++;
        }

        return 5 - conditionsMet;

    }
}
