package com.xpanxion.myapp.student26;

import javax.swing.text.html.HTMLDocument;

public class Main {
    public static void main(String[] args) {

        ex5();
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
        Dog d2 = new Dog();

    }

    private static void ex3() {
        System.out.println("Todo...");
    }

    private static void ex4() {
        Calculator calculator = new Calculator();
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

        var shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item(2.00F, 4, "Socks"));
        shoppingCart.addItem(new Item(10.00F, 2, "Shirts"));
        shoppingCart.calculateTotal();
        System.out.println(shoppingCart.getTotal());








    }
}
