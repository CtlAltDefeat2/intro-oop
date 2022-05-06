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

    public String getColor() {
        return color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public double getPrice() {
        return price;
    }

    public void Details(){
        System.out.println("Color: " + getColor());
        System.out.println("Number Of Wheels: " + getNumberOfWheels());
        System.out.println("Price: " + getPrice());
    }
}
