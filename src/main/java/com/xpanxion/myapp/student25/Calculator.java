package com.xpanxion.myapp.student25;

import java.util.ArrayList;

public class Calculator implements Calculatable{
    private ArrayList<String> history = new ArrayList<String>();

    public Calculator() {
        this.history = history;
    }

    @Override
    public Integer add(Integer number1, Integer number2) {
        int addition = 0;
        addition = number1 + number2;
        String result = number1 + " + " + number2 + " = " + addition + "\n";
        this.history.add(result);

        return addition;
    }

    @Override
    public Integer subtract(Integer number1, Integer number2) {
        int subtraction = 0;
        subtraction = number1 - number2;
        String result = number1 + " - " + number2 + " = " + subtraction + "\n";
        this.history.add(result);
        return subtraction;
    }

    @Override
    public Integer multiply(Integer number1, Integer number2) {
        int multiplication = 0;
        multiplication = number1 * number2;
        String result = number1 + " * " + number2 + " = " + multiplication + "\n";
        this.history.add(result);
        return multiplication;
    }

    @Override
    public Integer divide(Integer number1, Integer number2) {
       int division = 0;
       division = number1 / number2;
        String result = number1 + " / " + number2 + " = " + division + "\n";
        this.history.add(result);

        return division;
    }

    @Override
    public String getHistory() {
        var retVal = "";
        for ( int i = 0; i < history.size(); i++) {
            retVal += history.get(i);
        }
        return retVal;
    }
}
