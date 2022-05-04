package com.xpanxion.myapp.student12;

import java.util.ArrayList;

public interface Calculatable {
    Integer add(Integer numberX, Integer numberY);
    Integer subtract(Integer numberX, Integer numberY);
    Integer multiply(Integer numberX, Integer numberY);
    Integer divide(Integer numberX, Integer numberY);

    ArrayList<String> getHistory();

}
