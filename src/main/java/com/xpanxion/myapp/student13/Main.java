package com.xpanxion.myapp.student13;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
        // ex3();
        // ex4();
        // ex5();
    }

    private static void ex1() {
        var p1 = new Person();
        var p2 = new Person("Jon", "Smith");
        var p3 = new Person("Mary", "Jane", (byte) 12, 123456789);

        System.out.println(p1.speak());
        System.out.println(p2.speak());
        System.out.println(p3.speak());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Person count: " + Person.getPersonCount());

    }

    private static void ex2() {

        var d1 = new Dog("Rikku", "Spots", "White");
        var c1 = new Cat("Coset", "Furry", "Black");
        System.out.println(d1);
        System.out.println(c1);

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
