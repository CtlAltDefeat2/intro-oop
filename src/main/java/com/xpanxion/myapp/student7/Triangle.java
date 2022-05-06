package com.xpanxion.myapp.student7;

public class Triangle extends Shape{
    private int length;
    

    public Triangle(int length) {
        this.length = length;
        
    }

    @Override
    String draw() {
        String triString = "";
        for (int i = 1; i <= length; i++) {
            for (int j = i; j < length; j++) {
              triString += " ";
            }
            for (int k = 1; k <= (2*i -1); k++) {
                if(k == 1 || k ==(2*i -1) || i == length ){
                    triString += "*";
                }
                else {
                    triString += " ";
                }
                
            }
            triString += "\n";
        }

        
        return triString;
    }
}
