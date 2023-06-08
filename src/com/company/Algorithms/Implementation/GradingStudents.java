package com.company.Algorithms.Implementation;

public class GradingStudents {

//    https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> result = new ArrayList<>();
        for(int grade : grades){
            boolean wasAdded = false;
            if(grade >= 38){
                for(int i = 1; i < 3; i++){
                    if((grade + i) % 5 == 0){
                        result.add(grade + i);
                        wasAdded = true;
                        break;
                    }
                }
                if(wasAdded){
                    wasAdded = false;
                    continue;
                }
            }
            result.add(grade);

        }

        return result;

    }
}
