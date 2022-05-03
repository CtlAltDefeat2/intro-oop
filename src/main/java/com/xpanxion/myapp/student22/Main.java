package com.xpanxion.myapp.student22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex1();
        // ex2();
        // ex3();
        // ex4();
        // ex5();
    }

    private static void ex1() {
    //    Scanner input = new Scanner(System.in);
        Person p1 = new Person();
        Person p2 = new Person("Jhon", "Smith");
        Person p3 = new Person("mary", "Joe", (byte) 12,"123456789");


       // System.out.println("Enter student id");
       // int choice = input.nextInt();
       // if (choice == 1){
        System.out.println(p1.Speak());
        System.out.println(p2.Speak());
        System.out.println(p3.Speak());
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("person count: " + Person.getPersonCount());

        }


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
