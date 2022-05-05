package com.xpanxion.myapp.student3;

public class Main {
    public static void main(String[] args) {
        ex1();
        // ex2();
        // ex3();
         ex4();
         ex5();
    }

    private static void ex1() {System.out.println("Todo...");
        var p1 = new person();
        var p2 = new person("Jon", "Smith");
        var p3 = new person("Mary", "Jane", (byte) 12, 123456789);
        System.out.println(p1.speak());
        System.out.println(p2.speak());
        System.out.println(p3.speak());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Person count: " + person.getPersonCount());

    }

    private static void ex2() {
        System.out.println("Todo...");
    }

    private static void ex3() {
        System.out.println("Todo...");
    }

    private static void ex4() {
        System.out.println("Todo...");
        var calculator =  new Calculator();
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
        System.out.println("Todo...");
        var shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item(2.00F, 4, "Socks"));
        shoppingCart.addItem(new Item(10.00F, 2, "Shirts"));
        shoppingCart.calculateTotal();
        var invoice = shoppingCart.shipOrder("Jon Smith", "123 Green Street", "Austin", "TX", 78737);
        System.out.println(invoice);
    }
}