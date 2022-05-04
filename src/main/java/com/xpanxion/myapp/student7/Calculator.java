package com.xpanxion.myapp.student7;

import java.util.ArrayList;


public class Calculator implements Calculatable{
    private ArrayList History = new ArrayList<String>();
    @Override
    public Integer add(Integer number1, Integer number2) {
        int sum = number1 + number2;
        History.add(number1 + " + " + number2 + " = "+ sum +"\n");
        return sum;
    }
    @Override
    public Integer subtract(Integer number1, Integer number2) {
        int sum = number1 - number2;
        History.add(number1 + " - " + number2 + " = "+ sum +"\n");
        return sum;
    }
    @Override
    public Integer multiply(Integer number1, Integer number2) {
        int sum =number1 * number2;
        History.add(number1 + " * " + number2 + " = "+ sum +"\n");
        return sum;
    }
    @Override
    public Integer divide(Integer number1, Integer number2) {
        int sum = number1/number2;
        History.add(number1 + " / " + number2 + " = "+ sum +"\n");
        return sum;
    }
    @Override
    public String getHistory() {
        String retval = "";
        for (int i = 0; i < History.size(); i++) {
            retval += History.get(i);
        }
        return retval;
    }
}
