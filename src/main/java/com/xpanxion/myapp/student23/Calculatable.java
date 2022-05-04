package com.xpanxion.myapp.student23;

import java.util.ArrayList;

interface Calculatable {

    Integer add(Integer number1, Integer number2);
    Integer subtract(Integer number1, Integer number2);
    Integer multiply(Integer number1, Integer number2);
    Integer divide(Integer number1, Integer number2);

    String getHistory();
}