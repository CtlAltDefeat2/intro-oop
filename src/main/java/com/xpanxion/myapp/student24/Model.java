package com.xpanxion.myapp.student24;

public class Model extends Honda{
    private String model;
    private int mpg;
    private int horsePower;

    public Model(String color, int numberOfWheels, double price, int maxSpeed, int year, String model, int mpg, int horsePower) {
        super(color, numberOfWheels, price, maxSpeed, year);
        this.model = model;
        this.mpg = mpg;
        this.horsePower = horsePower;
    }

    @Override
    public void Details() {
        super.Details();
        System.out.println("Model: " + model);
        System.out.println("MPG: "+ mpg);
        System.out.println("HorsePower: " + horsePower);

    }
}
