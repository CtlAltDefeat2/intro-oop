package com.xpanxion.myapp.student16;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //ex1();
        // ex2();
        // ex3(); //not doing ex3
         ex4();
        // ex5();
    }

    private static void ex1() {
        byte personCount = 0;
        var p1 = new Person();// I am instantiating this person class
        personCount++;
        //p1 is an object person is the class
        var p2 = new Person("Jon", "Smith");
        personCount++;
        var p3 = new Person("Mary", "Jane", (byte) 12, 123456789);
        personCount++;
        //need a string to print out name, age, and SSN.
        //review Mary's lecture.
        System.out.println(p1.speak());
        System.out.println(p2.speak());
        System.out.println(p3.speak());
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(personCount);
    }





// ex2 starts here
    private static void ex2() {//done

        System.out.println("Todo...");
    }

   // private static void ex3() {
      //  System.out.println("Todo..."); //not doing ex3
   // }

   private static void ex4() {
       var calculator =  new Calculator();
       var result1 = calculator.add(1, 2);
       var result2 = calculator.subtract(4, 2);
       var result3 = calculator.divide(10, 5);
       var result4 = calculator.multiply(2, 2);

       System.out.println(result1);
       System.out.println(result2);
       System.out.println(result3);
       System.out.println(result4);
       System.out.println(calculator.getHistory());
    }

    private static void ex5() {
        System.out.println("Todo...");
    }
}
