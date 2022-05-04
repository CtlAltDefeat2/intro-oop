package com.xpanxion.myapp.student20;

import java.util.ArrayList;


public class Calculator implements Calculatable  {
    //
    //Data members
    //
    private int number1;
    private int number2;
    private ArrayList history = new ArrayList();
    //
    //Constructor
    //
    public Calculator(){
    }
    Calculator(Integer number1, Integer number2){
        this.number1 = number1;
        this.number2 = number2;
    }



    @Override
    public Integer add(Integer number1, Integer number2) {
        this.number1 = number1;
        this.number2 = number2;
        int sum = number1 + number2;
        String problem = "\n" + number1 + " + " + number2 + " = " + sum;
        this.history.add(problem);
        return sum;
    }

    @Override
    public Integer subtract(Integer number1, Integer number2) {
        this.number1 = number1;
        this.number2 = number2;
        int sum = number1 - number2;
        String problem = "\n" + number1 + " - " + number2 + " = " + sum;
        this.history.add(problem);
        return sum;
    }

    @Override
    public Integer multiply(Integer number1, Integer number2) {
        this.number1 = number1;
        this.number2 = number2;
        int sum = number1 * number2;
        String problem = "\n" + number1 + " * " + number2 + " = " + sum;
        this.history.add(problem);
        return sum;
    }

    @Override
    public Integer divide(Integer number1, Integer number2) {
        this.number1 = number1;
        this.number2 = number2;
        int sum = number1 / number2;
        String problem = "\n" + number1 + " / " + number2 + " = " + sum;
        this.history.add(problem);
        return sum;
    }

    public ArrayList<String> getHistory() {
        return history;
    }
}