package com.company.Java.ObjectOrientedProgramming;

public class JavaMethodOverriding {

//    https://www.hackerrank.com/challenges/java-method-overriding/problem?isFullScreen=true

    static class Sports{

        String getName(){
            return "Generic Sports";
        }

        void getNumberOfTeamMembers(){
            System.out.println( "Each team has n players in " + getName() );
        }
    }

    static class Soccer extends Sports{
        @Override
        String getName(){
            return "Soccer Class";
        }

        // Write your overridden getNumberOfTeamMembers method here
        @Override
        void getNumberOfTeamMembers(){
            System.out.println( "Each team has 11 players in " + getName() );
        }
    }

    public class Solution{

        public static void main(String []args){
            Sports c1 = new Sports();
            Soccer c2 = new Soccer();
            System.out.println(c1.getName());
            c1.getNumberOfTeamMembers();
            System.out.println(c2.getName());
            c2.getNumberOfTeamMembers();
        }
    }

}
