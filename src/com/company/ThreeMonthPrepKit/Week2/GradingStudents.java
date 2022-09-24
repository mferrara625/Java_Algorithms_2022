package com.company.ThreeMonthPrepKit.Week2;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {

//        https://www.hackerrank.com/challenges/three-month-preparation-kit-grading/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-two

        List<Integer> result = new ArrayList<>();
        for(Integer grade : grades){
            if(grade > 37 && (5 - (grade % 5)) < 3)
                result.add(grade + (5 - (grade % 5)));
            else
                result.add(grade);
        }
        return result;
    }
}
