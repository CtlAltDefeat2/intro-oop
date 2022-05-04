package com.xpanxion.myapp.student24;

import java.util.ArrayList;

public class Calculator implements Calculatable{

    private ArrayList calcHistory = new ArrayList();
    @Override
    public Integer add(Integer number1, Integer number2) {
       int sum = number1 + number2;
       String result = number1 + " + " + number2 + " = " + sum + "\n";
       this.calcHistory.add(result);
        return sum;
    }

    @Override
    public Integer subtract(Integer number1, Integer number2) {
        int sum = number1 - number2;
        String result = number1 + " - " + number2 + " = " + sum + "\n";
        this.calcHistory.add(result);
        return sum;
    }

    @Override
    public Integer multiply(Integer number1, Integer number2) {
        int sum = number1 * number2;
        String result = number1 + " * " + number2 + " = " + sum + "\n";
        this.calcHistory.add(result);
        return sum;
    }

    @Override
    public Integer divide(Integer number1, Integer number2) {
        int sum = number1 / number2;
        String result = number1 + " / " + number2 + " = " + sum + "\n";
        this.calcHistory.add(result);
        return sum;

    }

    @Override
    public ArrayList<String> getHistory(){
        System.out.println("Calculator History");
        return calcHistory;
    }

}
