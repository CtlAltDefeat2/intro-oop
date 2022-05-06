package com.xpanxion.myapp.student22;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //ex1();
        // ex2();
        // ex3();
        //ex4();
         ex5();
    }

    private static void ex1() {
        //    Scanner input = new Scanner(System.in);
        Dog d1 = new Dog("Bethoven", "Bethy", "Brown", 3);
        Cat c1 = new Cat("Cathy", "Cat", "Black", 1);

        var a = d1.getName() + " " + d1.getNickName() + " " + d1.getColor() + " " + d1.getAge();
        var b = c1.getName() + " " + c1.getNickName() + " " + c1.getColor() + " " + c1.getAge();
        System.out.println(a);
        System.out.println(b);

        /*System.out.println(p1.Speak());
        System.out.println(p2.Speak());
        System.out.println(p3.Speak());
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(Animal.getPersonCount());*/

    }


    private static void ex2() {
        System.out.println("Todo...");
    }

    private static void ex3() {
        System.out.println("Todo...");
    }

    private static void ex4() {

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
    }

    private static void ex5() {
        var shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item(2.0f, 4, "socks"));
        shoppingCart.addItem(new Item(10.0f, 2, "Shirts"));
        //shoppingCart.shoppingOrder(new Invoice("jhon", "123 Green Street", "Austin", "TX",78737));
        shoppingCart.calculateTotal();
       // shoppingCart.shippingCost();
        System.out.println(shoppingCart.getTotal());
        System.out.println(shoppingCart.shippingCost());
        var invoice = shoppingCart.shipOrder("Jhon", " 1111", "auxtin", "TX", 112, shoppingCart);
        System.out.println(invoice);
    }
}