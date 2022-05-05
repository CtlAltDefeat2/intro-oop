package com.xpanxion.myapp.student20;

import java.util.ArrayList;


public class Calculator implements Calculatable  {
    //
    //Data members
    //
    private int number1;
    private int number2;
    private ArrayList<String> history = new ArrayList();
    //
    //Constructor
    //
    public Calculator(){
    }
    @Override
    public Integer add(Integer number1, Integer number2) {
        int sum = number1 + number2;
        String problem =  number1 + " + " + number2 + " = " + sum;
        this.history.add(problem);
        return sum;
    }
    @Override
    public Integer subtract(Integer number1, Integer number2) {
        int sum = number1 - number2;
        String problem = "\n" + number1 + " - " + number2 + " = " + sum;
        this.history.add(problem);
        return sum;
    }

    public String getHistory(){
        String listString = String.join("",history);
        return listString;
    }
}