package com.company.Java.Introduction;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void javaOutputFormatting() {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();

            String space = "";
            for(int j = 0; j < (15 - s1.length()); j++){
                space += " ";
            }
            String xString = "";
            if(x < 100 && x > 0)
                xString = "0" + String.valueOf(x);
            else if(x == 0)
                xString = "000";
            else
                xString = String.valueOf(x);


            System.out.println(s1 + space + xString);
            //Complete this line
        }
        System.out.println("================================");

    }
}
