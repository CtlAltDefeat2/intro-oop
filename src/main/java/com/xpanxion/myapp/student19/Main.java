package com.xpanxion.myapp.student19;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       // ex1();
         //ex2();
        ex3();
        // ex4();
        // ex5();
    }
    private static void ex1(){
      //  var p1 = new Person();
        //var p2 = new Person("Jon", "Smith");
        //var p3 = new Person("Mary", "Jane",  12, "123456789");

      //  System.out.println(p1.speak());
       // System.out.println(p2.speak());
       // System.out.println(p3.speak());

       // System.out.println(p1);
       // System.out.println(p2);
       // System.out.println(p3);

        System.out.println("Person count: " + Person.getPersonCount());
    }



    private static void ex2() {
        {
           var person1 = new Person ("Matt Smith", "ms", "white", 25, "Smith", "Matt", "123456789");
           var cat1 = new Cat ("Henry", "Littleone", "White", 5);
           var dog1 = new Dog ("Charlie", "Cute","Brown", 7);
        }
    }

    private static void ex3() {
        var calculator =  new Caliculator();
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

    private static void ex4() {
        System.out.println("Todo...");
    }

    private static void ex5() {
        System.out.println("Todo...");
    }
}
