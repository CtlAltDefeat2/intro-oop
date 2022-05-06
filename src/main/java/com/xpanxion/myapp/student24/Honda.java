package com.xpanxion.myapp.student24;

public class Honda extends Car {

    private  int maxSpeed;
    private int year;


    public Honda(String color, int numberOfWheels, double price, int maxSpeed, int year) {
        super(color, numberOfWheels, price);
        this.maxSpeed = maxSpeed;
        this.year = year;
    }

    public int getMaxSpeed() {
        // validation
        return maxSpeed;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void Details() {
        super.Details();
        System.out.println("Max Speed: " + getMaxSpeed());
        System.out.println("Year:" + getYear());
    }
}
