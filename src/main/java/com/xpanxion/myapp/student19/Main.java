package com.xpanxion.myapp.student19;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       // ex1();
         ex2();
        // ex3();
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
       // Refactor the `Person` class to subclass (extend) a class called `Animal`.  Move the `age` from the `Person`
        //class to the `Animal` class. Create a `Dog` and `Cat` class that subclass the `Animal` class.

        //The `Dog` and `Cat` class have the following properties:
        // Name
           //     - Nickname
             //   - Color
        {
           var person1 = new Person ("Matt Smith", "ms", "white", 25, "Smith", "Matt", "123456789");
            //System.out.println("Dog name,nickName,color");
           //System.out.println("Cat name,nickName,color");
        }
    }

    private static void ex3() {
        System.out.println("Todo...");
    }

    private static void ex4() {
        System.out.println("Todo...");
    }

    private static void ex5() {
        System.out.println("Todo...");
    }
}
