package com.company.Java.DataStructures;

import java.util.Comparator;

public class JavaComparator {

//    https://www.hackerrank.com/challenges/java-comparator/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

    class Checker implements Comparator<Player> {
        public int compare(Player p1, Player p2){
            if(p1.score == p2.score) {
                return p1.name.compareTo(p2.name);
            }
            return p2.score - p1.score;
        }
    }

    class Player{
        int score;
        String name;

    }
}
