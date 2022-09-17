package com.company.ThreeMonthPrepKit.WeekTwo;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
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
