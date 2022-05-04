package com.xpanxion.myapp.student21;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Calculator implements Calculatable{

    public Calculator() {
    }

    ArrayList historyList = new ArrayList<String>();

    @Override
    public Integer add(Integer number1, Integer number2) {
        historyList.add(number1 + " + " + number2 + " = " + (number1+number2)+ "\n");
        return (number1+number2);
    }

    @Override
    public Integer subtract(Integer number1, Integer number2) {
        historyList.add(number1 + " - " + number2 + " = " + (number1-number2)+ "\n");
        return (number1 - number2);
    }

    @Override
    public Integer multiply(Integer number1, Integer number2) {
        historyList.add(number1 + " * " + number2 + " = " + (number1*number2)+ "\n");
        return (number1 * number2);
    }

    @Override
    public Integer divide(Integer number1, Integer number2) {
        historyList.add(number1 + " / " + number2 + " = " + (number1/number2)+ "\n");
        return (number1 / number2);
    }

    @Override
    public String getHistory() {
        String retVal = "";
        //String retVal = "line1\nline2\nline3";

        // loop through that list
        for (int i = 0; i<historyList.size(); i++){
            retVal += historyList.get(i);
        }
        return retVal;
    }
}







