package com.xpanxion.myapp.student26;

import javax.swing.text.html.HTMLDocument;

public class Main {
    public static void main(String[] args) {

        ex2();
    }

    private static void ex1() {

       var p1 = new Person();
       var p2 = new Person("John", "Smith");
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

        Dog d1= new Dog("Champion", "champ", "white");
        System.out.println("His name is " + d1.getName() + " Nickname is "+ d1.getNickname() + " and his color is " + d1.getNickname());




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
