package com.xpanxion.myapp.student16;

public class Main {
    public static void main(String[] args) {
        ex1();
        // ex2();
        // ex3();
        // ex4();
        // ex5();
    }

    private static void ex1() {
        var p1 = new Person();
        var p2 = new Person("Jon", "Smith");
        var p3 = new Person("Mary", "Jane", (byte) 12, 123456789);
        //need a string to print out name, age, and SSN.
        //review Mary's lecture.
        System.out.println(p1.speak());
        System.out.println(p2.speak());
        System.out.println(p3.speak());
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("Person count: " + Person.getPersonCount());
    }





// ex2 starts here
    private static void ex2() {
        System.out.println("Todo...");
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
