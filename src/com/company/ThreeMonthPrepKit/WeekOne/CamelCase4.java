package com.company.ThreeMonthPrepKit.WeekOne;

import java.util.Scanner;

public class CamelCase4 {
        public static void separate(String input){
            String result = "";

            for(int i = 4; i < input.length(); i++){
                if(input.charAt(i) == '(' || input.charAt(i) == ')' )
                    continue;
                if(input.charAt(i) <= 90)   //checks to see if letter is UpperCase
                    result+= " ";
                result+= input.charAt(i);
            }

            System.out.println(result.toLowerCase().trim());

        }

        public static void combine(String input){
            String result = "";
            switch (input.charAt(2)) {
                case 'M':
                    result = combineMethod(input, 4, result);
                    result+= "()";
                    break;
                case 'C':
                    result += String.valueOf(input.charAt(4)).toUpperCase();
                    result = combineMethod(input, 5, result);
                    break;
                case 'V':
                    result = combineMethod(input, 4, result);

                    break;

            }
            System.out.println(result.replaceAll("\\s", ""));

        }

        public static String combineMethod(String input, int index, String result){

            for(int i = index; i < input.length(); i++){
                if(input.charAt(i) == 32){  //checks for empty space
                    i++;
                    result+= String.valueOf(input.charAt(i)).toUpperCase();
                    continue;
                }
                result+= input.charAt(i);
            }
            return result;
        }

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner scan = new Scanner(System.in);
            while(true){
                if(scan.hasNextLine()){
                    String currentLine = scan.nextLine();
                    // System.out.println(currentLine);
                    if(currentLine.charAt(0) == 'S')
                        separate(currentLine);
                    else
                        combine(currentLine);

                }
                else
                    break;
            }
            scan.close();

        }
    }
