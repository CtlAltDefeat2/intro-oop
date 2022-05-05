package com.xpanxion.myapp.student8;


import java.util.ArrayList;

public class Calculator implements Calculatable {
    ArrayList<String> history = new ArrayList<String>();

    @Override
    public Integer add(Integer number1, Integer number2) {
        var answer = number1 + number2;
        String equation = (number1 + " + " + number2 + " = " + answer);
        history.add(equation);
        return answer;
    }

    @Override
    public Integer subtract(Integer number1, Integer number2) {
        var answer = number1 - number2;
        String equation = (number1 + " - " + number2 + " = " + answer);
        history.add(equation);
        return answer;
    }

    @Override
    public Integer multiply(Integer number1, Integer number2) {
        var answer = number1 * number2;
        String equation = (number1 + " * " + number2 + " = " + answer);
        history.add(equation);
        return answer;
    }

    @Override
    public Integer divide(Integer number1, Integer number2) {
        var answer = number1 / number2;
        String equation = (number1 + " / " + number2 + " = " + answer);
        history.add(equation);
        return answer;
    }


    @Override
    public String getHistory() {
        for (int i = 0; i < history.size(); i++) {
            System.out.println(history.get(i));
        }
        return "";
    }
}
