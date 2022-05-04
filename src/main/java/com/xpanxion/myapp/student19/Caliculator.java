package com.xpanxion.myapp.student19;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Caliculator implements Calculatable {
     private ArrayList<String> history = new ArrayList<String>();
    @Override
    public Integer add(Integer number1 , Integer number2) {
        history.add(number1 + " + " + number2 + " = " + (number1 + number2) + "\n");
        return (number1 + number2);
    }
    @Override
    public Integer subtract(Integer number1, Integer number2) {
        history.add(number1 + "" + " - " + number2 + " = " + (number1 - number2) +"\n");
        return (number1- number2);
    }
    @Override
    public Integer multiply(Integer number1, Integer number2) {
        history.add(number1 + " * " + number2 + " = " + (number1 * number2) +"\n");
        return (number1 * number2);
    }
    @Override
    public Integer  divide(Integer number1, Integer number2) {
        history.add(number1 + " / " + number2 + " = " + (number1 / number2) + "\n");
        return (number1 / number2);
    }
    @Override
   public ArrayList<String> getHistory() {
        return history;
}
}
