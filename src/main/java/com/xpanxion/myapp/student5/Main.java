package com.xpanxion.myapp.student5;

public class Main {
    public static void main(String[] args) {
        // ex1();
        ex2();
        // ex3();
        // ex4();
        // ex5();
    }
    private static void ex1() {
        var p1 = new Person();
        var p2 = new Person("Jon", "Smith");
        var p3 = new Person("Mary", "Jane", (byte) 12, "123456789");

        System.out.print(p1.speak());
        System.out.print(p2.speak());
        System.out.print(p3.speak());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Person count: " + Person.getPersonCount());
    }

    private static void ex2() {
        var cat1 = new Cat("Alexander", "Al", "Gray", (byte) 2);
        var dog1 = new Dog("Thor Odinson", "Thor", "White/Gray", (byte) 4);

        System.out.println(cat1);
        System.out.println(dog1);
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
