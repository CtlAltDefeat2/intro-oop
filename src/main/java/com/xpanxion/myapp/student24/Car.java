package com.xpanxion.myapp.student24;

public class Car {
    private String color;
    private int numberOfWheels;
    private double price;

    public Car(String color, int numberOfWheels, double price) {
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.price = price;
    }
    public void Details(){
        System.out.println("Color: " + color);
        System.out.println("Number Of Wheels: " + numberOfWheels);
        System.out.println("Price: " + price);
    }
}
