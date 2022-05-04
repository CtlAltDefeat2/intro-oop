package com.xpanxion.myapp.student14;

import java.util.ArrayList;


public class Calculator implements Calculatable {

    private ArrayList<String> calcHistory = new ArrayList<String>();

    @Override
    public Integer add(Integer number1, Integer number2) {
        var addition = 0;
        addition = number1 + number2;
        String result = number1 + " + " + number2 + " = " + addition + "\n";
        this.calcHistory.add(result);
        return addition;
    }

    @Override
    public Integer subtract(Integer number1, Integer number2) {
        var subtraction = 0;
        subtraction = number1 - number2;
        String result = number1 + " - " + number2 + " = " + subtraction + "\n";
        this.calcHistory.add(result);
        return subtraction;
    }

    @Override
    public Integer multiply(Integer number1, Integer number2) {
        var multiplication = 0;
        multiplication = number1 * number2;
        String result = number1 + " * " + number2 + " = " + multiplication + "\n";
        this.calcHistory.add(result);
        return multiplication;
    }

    @Override
    public Integer divide(Integer number1, Integer number2) {
        var division = 0;
        division = number1 / number2;
        String result = number1 + " / " + number2 + " = " + division + "\n";
        this.calcHistory.add(result);
        return division;
    }

    @Override
    public String getHistory() {
        var retVal = "";
        //var retVal = "1 + 2 = 3\n4 - 2 = 2\n10 / 5 = 2\n";
        for (int i = 0; i<calcHistory.size(); i++) {
            retVal += calcHistory.get(i);
        }
        return retVal;
    }
}
