package com.xpanxion.myapp.student9;

public class Main {
    public static void main(String[] args) {

        // ex1();
        // ex2();
        // ex3();
        //  ex4();
        ex5();
    }
    /*    private static void ex1() {
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

            var dog = new Dog("Jonesy", "jones", "brown");


  /*private static void ex2() {
        System.out.println("Todo...");
    }

    private static void ex3() {
        System.out.println("Todo...");*/


    /*private static void ex4() {
        var calculator = new Calculator();
        var result1 = calculator.add(1, 2);
        var result2 = calculator.subtract(4, 2);
        var result3 = calculator.divide(10, 5);
        var result4 = calculator.multiply(2, 2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(calculator.getHistory());

        //System.out.println("Todo...");*/

    private static void ex5() {
        System.out.println("Exercise 5");
        // Define variables.
        var cart = new ShoppingCart();
        cart.addItem(new Item(2.00F, 4, "Socks"));
        cart.addItem(new Item(10.00F, 2, "Shirts"));
        cart.calculateTotal();
        System.out.println(cart.getTotal());

        var invoice = cart.shipOrder("Jon Smith", "123 Green Street", "Austin", "TX", 78737);
        System.out.println(invoice);
    }
}



