package com.xpanxion.myapp.student12;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Calculator{
    //
    //Data Member
    //
    private int numberX;
    private int numberY;

    private ArrayList history = new ArrayList();

    //
    //Constructor
    //
    Calculator() {
    }
    Calculator(int numberX, int numberY){
        this.numberX = numberX;
        this.numberY = numberY;
    }
    //
    //Methods
    //
    public int add(int numberX, int numberY){
        this.numberX = numberX;
        this.numberY = numberY;

        int result = numberX + numberY;
        String sum = numberX + " + " + numberY +" = " + result;
        this.history.add(sum);
        return result;
    }
    public int subtract(int numberX, int numberY){
        this.numberX = numberX;
        this.numberY = numberY;

        int result = numberX - numberY;
        String sub = "\n" + numberX + " - " + numberY +" = " + result;
        this.history.add(sub);
        return result;
    }
    public int divide(int numberX, int numberY){
        this.numberX = numberX;
        this.numberY = numberY;
        if (numberY == 0){
            return 0;
        }
        else {
            int result = numberX / numberY;
            String ratio = "\n" + numberX + " / " + numberY + " = " + result;
            this.getHistory().add(ratio);
            return result;
        }
    }
    public int multiply(int numberX, int numberY){
        this.numberX = numberX;
        this.numberY = numberY;

        int result = numberX * numberY;
        String product = "\n" + numberX + " * " + numberY + " = " + result;
        this.history.add(product);
        return result;
    }
    public ArrayList getHistory(){
        //ArrayList history = new ArrayList<String>();
        return history;
    }
}
