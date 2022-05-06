package com.xpanxion.myapp.student24;

public class Truck extends Car {
    private int numberOfWheels;
    private int mpg;

    public Truck(String color, int numberOfWheels, double price, int numberOfWheels1, int mpg) {
        super(color, numberOfWheels, price);
        this.numberOfWheels = numberOfWheels1;
        this.mpg = mpg;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getMpg() {
        return mpg;
    }

    @Override
    public void Details() {
        super.Details();
        System.out.println("Number of total wheels truck has : " + numberOfWheels);
        System.out.println("MPG: " + mpg);
    }
}
