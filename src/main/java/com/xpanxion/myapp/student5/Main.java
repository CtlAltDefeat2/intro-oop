package com.xpanxion.myapp.student5;

public class Main {
    public static void main(String[] args) {
        // ex1();
        // ex2();
        ex3();
        // ex4();
        // ex5();
        // ex6();
        // ex7();
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
        var dog1 = new Dog("Thor Odin-son", "Thor", "White/Gray", (byte) 4);

        System.out.println(cat1);
        System.out.println("Cat Count: " + Cat.getCatCount());
        System.out.println(dog1);
        System.out.println("Dog Count: " + Dog.getDogCount());
    }
    private static void ex3() {
        var n1 = new AwesomeNumber(4);
        var n2 = new AwesomeNumber(2);
        var result1 = AwesomeNumber.add(n1, n2);
        var result2 = AwesomeNumber.subtract(n1, n2);
        System.out.println(result1);
        System.out.println(result2);
    }

    private static void ex4() {
        System.out.println("Todo...");
    }

    private static void ex5() {
        System.out.println("Todo...");
    }

    private static void ex6() { System.out.println("Todo..."); }

    private static void ex7() { System.out.println("Todo..."); }
}
