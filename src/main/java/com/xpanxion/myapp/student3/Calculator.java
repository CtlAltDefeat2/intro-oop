package com.xpanxion.myapp.student3;

import java.util.ArrayList;

public class Calculator implements Calculatable {
    private ArrayList History = new ArrayList<String>();

    @Override
    public Integer add(Integer number1, Integer number2) {
        History.add(number1 + " + " + number2 + " = "+ (number1+number2)+"\n");

        return number1 + number2;

    }

    @Override
    public Integer subtract(Integer number1, Integer number2) {
        History.add(number1 + " + " + number2 + " = "+ (number1-number2)+"\n");
        return number1 - number2;
    }

    @Override
    public Integer multiply(Integer number1, Integer number2) {
        History.add(number1 + " + " + number2 + " = "+ (number1*number2)+"\n");
        return number1 * number2;
    }

    @Override
    public Integer divide(Integer number1, Integer number2) {
        History.add(number1 + " + " + number2 + " = "+ (number1/number2)+"\n");
        return number1 / number2;
    }

    @Override
    public ArrayList<String> getHistory() {
        return History;
    }

}
