package com.xpanxion.myapp.student7;

public class Circle extends Shape{
    private double distance;
    private int rad;

    public Circle(int rad) {
        this.distance = distance;
        this.rad = rad; //radius
    }

    @Override
    String draw() {
        String circleStar = "";
        for (int i = 0; i <= 2*rad ; i++) {
            for (int j = 0; j <= 2*rad; j++) {
                distance = Math.sqrt(((i-rad)*(i-rad)) + ((j-rad)*(j-rad)));
                if(distance > (rad -0.5 )&& distance < (rad+0.5)){
                    circleStar += "*";
                }
                else {
                    circleStar += " ";
                }
            }
            circleStar+="\n";

        }

        return circleStar;
    }
}
