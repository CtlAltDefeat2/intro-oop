package com.xpanxion.myapp.student21;

public class Main {
    public static void main(String[] args) {
       // ex1();
        // ex2();
        // ex3();
        // ex4();
         ex5();
    }

    private static void ex1() {
//        Person p1 = new Person();
//        Person p2 = new Person("Jon", "Smith");
//        Person p3 = new Person("Mary", "Jane", (byte) 12, "123456789");

//        System.out.println(p1.speak());
//        System.out.println(p2.speak());
//        System.out.println(p3.speak());

//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);

//        System.out.println("Person count: " + Person.getPersonCount());
















    }

    private static void ex2() {
        System.out.println("Todo...");
    }

    private static void ex3() {
        System.out.println("Todo...");
    }

    private static void ex4() {
        //        Calculator class
        var calculator =  new Calculator();
        var result1 = calculator.add(1, 2);
        var result2 = calculator.subtract(4, 2);
        var result3 = calculator.divide(10, 5);
        var result4 = calculator.multiply(2, 2);
        var result5 = calculator.multiply(500,500);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(calculator.getHistory());

    }

    private static void ex5() {
        //Creates a shopping cart with a shipping charge of $5 if the total is less than $10
        var shoppingCart = new ShoppingCart(5.00f);
        //These two items are added to the cart through the "addItem" method in ShoppingCart
        shoppingCart.addItem(new Item(2.00F, 1, "Socks"));
        shoppingCart.addItem(new Item(5.00F, 5, "Shirts"));
        //loops through the items in the list, adds them up, applies tax, and determines if the shipping fee is applied
        shoppingCart.calculateTotal();
        //These are the parameters that are passed into our "shoppingCart" object along with the items and total.
        var invoice = shoppingCart.shipOrder("Jon Smith", "123 Green Street", "Austin", "TX", 78737);
        // This prints out the custom invoice toString method we made in the invoice class
        System.out.println(invoice);
    }
}
