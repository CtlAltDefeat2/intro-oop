package com.xpanxion.myapp.student2;

public class AwesomeNumber {

    private int x;

    public int getY() {
        return y;
    }

    public void setY(int b) {
        this.y = b;
    }

    private int y;

    public static void subtract(int x, int y){
    }

    public int getX() {
        return x;
    }

    public void setX(int a) {
        this.x = a;
    }
    public AwesomeNumber(int a){
        x=a;
    }
    
    public AwesomeNumber() {
    }
    public static int add(int a, int b){
        return  a+b;
    }

    @Override
    public String toString() {
        return Integer.toString(x);
    }
}
