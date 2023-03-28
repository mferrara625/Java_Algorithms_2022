package com.company.Algorithms.Implementation;

public class TheTimeInWords {

//    https://www.hackerrank.com/challenges/the-time-in-words/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

    public static String timeInWords(int h, int m) {
        String result="";
        String []Ones={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"};
        String[] tens={"zero","ten","twenty","thirty","fourty","fifty","sixty"};
        String [] elevens={"zero","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        if(m==0){
            result=Ones[h]+" o' clock";
        }else if(m<30){
            if(m==1){
                result=Ones[1]+" minute past "+Ones[h];
            }else if(m/10==0){
                result=Ones[m]+" minutes past "+Ones[h];
            }else if(m/10==1){
                if(m==15){
                    result="quarter past "+Ones[h];
                }else{
                    int n=m%10;
                    result=elevens[n]+" minutes past "+Ones[h];
                }
            }else {
                result=tens[m/10]+" "+Ones[m%10]+" minutes past "+Ones[h];
            }
        }else if(m==30){
            result="half past "+Ones[h];
        }else if(m>30){
            m=60-m;
            if(m==1){
                result=Ones[1]+" minute to "+Ones[h+1];
            }else if(m/10==0){
                result=Ones[m]+" minutes to "+Ones[h+1];
            }else if(m/10==1){
                if(m==15){
                    result="quarter to "+Ones[h+1];
                }else{
                    int n=m%10;
                    result=elevens[n]+" minutes to "+Ones[h+1];
                }
            }else{
                result=tens[m/10]+" "+Ones[m%10]+" minutes to "+Ones[h+1];
            }
        }
        return result;
    }
}
