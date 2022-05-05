package com.xpanxion.myapp.student26;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Calculator implements Calculatable {

    private ArrayList history = new ArrayList<String>();

   Calculator(){}
    @Override
    public Integer add(Integer number1, Integer number2) {
        int sum =number1+number2;

       String histories = number1 +  "+" + number2 + "=" + sum;

       this.history.add(histories);
       return sum;

    }

    @Override
    public Integer subtract(Integer number1, Integer number2) {

        int sum = number1-number2;
        String histories = "\n"+ number1 + "-" + number2 + "=" + sum;
       this.history.add(histories);

        return sum;


    }

    @Override
    public Integer multiply(Integer number1, Integer number2) {
       int sum = number1 * number2;
       String histories = "\n" + number1 + "*" + number2 + "=" + sum;
       this.history.add(histories);
       return sum;
    }

    @Override
    public Integer divide(Integer number1, Integer number2) {
        int sum = number1 / number2;
        String histories = "\n" + number1 + "/" + number2 + "=" + sum;
        this.history.add(histories);
        return sum;
    }

    @Override
    public ArrayList<String> getHistory() {


       return history;
    }
}
