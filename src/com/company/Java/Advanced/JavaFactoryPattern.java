package com.company.Java.Advanced;

import java.util.Scanner;

public class JavaFactoryPattern {

//    https://www.hackerrank.com/challenges/java-factory/problem?isFullScreen=true
    interface Food {
        public String getType();
    }
    class Pizza implements Food {
        public String getType() {
            return "Someone ordered a Fast Food!";
        }
    }

    class Cake implements Food {

        public String getType() {
            return "Someone ordered a Dessert!";
        }
    }
    class FoodFactory {
        public Food getFood(String order) {
            if(order.equals("cake")){
                return new Cake();
            }
            return new Pizza();

        }//End of getFood method

    }//End of factory class


}
