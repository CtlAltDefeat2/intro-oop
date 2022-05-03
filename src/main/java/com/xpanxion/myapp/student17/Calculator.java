package com.xpanxion.myapp.student17;

import java.util.ArrayList;

interface Calculatable {

    Integer add(Integer number1, Integer number2);
    Integer subtract(Integer number1, Integer number2);
    Integer multiply(Integer number1, Integer number2);
    Integer divide(Integer number1, Integer number2);

    ArrayList<String> getHistory();
}

public class Calculator {
    //
    //Data members
    //
    private int x;
    private int y;
    private ArrayList history = new ArrayList();
    //
    //Constructor
    //
    public Calculator(){
    }
    Calculator(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Integer add(int x, int y){
        this.x = x;
        this.y = y;
        int sum = x + y;
        String problem = x + " + " + y + " = " + sum;
        this.history.add(problem);
        return sum;
    }
    public Integer subtract(int x, int y){
        this.x = x;
        this.y = y;
        int sum = x - y;
        String problem = "\n" + x + " - " + y + " = " + sum;
        this.history.add(problem);
        return sum;

    }
    public Integer divide(int x, int y){
        this.x = x;
        this.y = y;
        int sum = x / y;
        String problem = "\n" + x + " / " + y + " = " + sum;
        this.history.add(problem);
        return sum;
    }
    public Integer multiply(int x, int y){
        this.x = x;
        this.y = y;
        int sum = x * y;
        String problem = "\n" + x + " * " + y + " = " + sum;
        this.history.add(problem);
        return sum;
    }
    public ArrayList<String> getHistory() {
        return history;
    }
}
