package com.xpanxion.myapp.student5;

import java.util.ArrayList;
import java.util.Arrays;

public class Calculator implements Calculatable {
    private ArrayList<String> calculatorHistory = new ArrayList<>();
    // Constructors
    public Calculator () {
    }
    // Methods
    public Integer add(Integer n1, Integer n2) {
        int result = Integer.sum(n1, n2);
        calculatorHistory.add(n1 + " + " + n2 + " = " + result);
        return result;
    }
    public Integer subtract(Integer n1, Integer n2) {
        int result = Integer.sum(n1, -n2);
        calculatorHistory.add("\n" + n1 + " - " + n2 + " = " + result);
        return result;
    }
    public Integer multiply(Integer n1, Integer n2) {
        int result = n1 * n2;
        calculatorHistory.add("\n" + n1 + " * " + n2 + " = " + result);
        return result;
    }
    public Integer divide(Integer n1, Integer n2) {
        int result = n1 / n2;
        calculatorHistory.add("\n" + n1 + " / " + n2 + " = " + result);
        return result;
    }
    public ArrayList<String> getHistory() {
        return calculatorHistory;
    }
}
