package com.xpanxion.myapp.student12;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Calculator
implements Calculatable {
    //
    //Data Member
    //
    private Integer numberX;
    private Integer numberY;

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
    @Override
    public Integer add(Integer numberX, Integer numberY) {
        this.numberX = numberX;
        this.numberY = numberY;

        int result = numberX + numberY;
        String sum = numberX + " + " + numberY +" = " + result;
        this.history.add(sum);
        return result;
    }

    @Override
    public Integer subtract(Integer numberX, Integer numberY) {
        this.numberX = numberX;
        this.numberY = numberY;

        int result = numberX - numberY;
        String sub = "\n" + numberX + " - " + numberY +" = " + result;
        this.history.add(sub);
        return result;
    }

    @Override
    public Integer multiply(Integer numberX, Integer numberY) {
        this.numberX = numberX;
        this.numberY = numberY;

        int result = numberX * numberY;
        String product = "\n" + numberX + " * " + numberY + " = " + result;
        this.history.add(product);
        return result;
    }

    @Override
    public Integer divide(Integer numberX, Integer numberY) {
        this.numberX = numberX;
        this.numberY = numberY;
        if (numberY == 0){
            return 0;
        }
        else {
            int result = numberX / numberY;
            String ratio = "\n" + numberX + " / " + numberY + " = " + result;
            this.history.add(ratio);
            return result;
        }
    }

    public String getHistory(){
        //ArrayList history = new ArrayList<String>();
        String listString = String.join(",",history);
        return listString;
    }
}
