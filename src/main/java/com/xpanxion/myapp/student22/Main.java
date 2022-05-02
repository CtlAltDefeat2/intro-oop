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
        Scanner input = new Scanner(System.in);
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        p1.setId(1);
        p1.setFirstName("Jhon");
        p1.setLastName("Smith");
        p2.setId(2);
        p2.setFirstName("Mary");
        p2.setLastName("Joe");
        p3.setId(3);
        p3.setFirstName("Peter");
        p3.setLastName("Griffen");

        System.out.println("Enter student id");
        int choice = input.nextInt();
        if (choice == 1){
            System.out.println(p1.getId() + "," + p1.getFirstName() + "," + p1.getLastName());
        }
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
