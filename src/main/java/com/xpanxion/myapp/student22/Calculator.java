package com.xpanxion.myapp.student22;

import java.util.ArrayList;

public class Calculator implements Calculatable{
    ArrayList<String> history = new ArrayList<String>();
    @Override
    public Integer add(Integer number1, Integer number2) {
        int sum = number1 + number2;
        String histories = number1 +" +" + number2 +" =" + sum;
        this.history.add(histories);
        return sum;
    }

    @Override
    public Integer subtract(Integer number1, Integer number2) {
        int sum = number1 - number2;
        String histories = number1 +" -" + number2 +" =" + sum;
        this.history.add(histories);
        return sum;
    }

    @Override
    public Integer multiply(Integer number1, Integer number2) {
        int sum = number1 * number2;
        String histories = number1 +" *" + number2 +" =" + sum;
        this.history.add(histories);
        return sum;
    }

    @Override
    public Integer divide(Integer number1, Integer number2) {
        int sum = number1 / number2;
        String histories = number1 +" /" + number2 +" =" + sum;
        this.history.add(histories);
        return sum;
    }

    @Override
    public String getHistory() {
        String retVal = "";
        for (String i : history){
            System.out.println(i);
        }

        return retVal;
    }

}
