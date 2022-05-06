package com.xpanxion.myapp.student13;

import java.util.ArrayList;

public class Calculator implements Calculatable{
    private Integer number1;
    private Integer number2;
    private ArrayList<String> addHistory = new ArrayList();

    // Default Constructor
    Calculator() {
    }
    // Constructor with 2 parameters
    Calculator(Integer number1, Integer number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    // Methods
    public Integer add(Integer number1, Integer number2) {
        var calculate = number1 + number2;
        String addExp = number1 + "+" + number2 + "=" + calculate;
        this.addHistory.add(addExp);
        return calculate;
    }

    public Integer subtract(Integer number1, Integer number2){
        var calculate = number1 - number2;
        String addExp = "\n" + number1 + "-" + number2 + "=" + calculate;
        this.addHistory.add(addExp);
        return calculate;
    }

    public Integer multiply(Integer number1, Integer number2){
        var calculate = number1 * number2;
        String addExp = "\n " + number1 + "*" + number2 + "=" + calculate;
        this.addHistory.add(addExp);
        return calculate;
    }

    public Integer divide(Integer number1, Integer number2) {
        var calculate = number1 / number2;
        String addExp = "\n" + number1 + "/" + number2 + "=" + calculate;
        this.addHistory.add(addExp);
        return calculate;
    }

    @Override
    public String getHistory() {
        var retVal = "";
        for (int i = 0; i < addHistory.size(); i++) {
            retVal += addHistory.get(i);
        }
        return retVal;
    }
}
