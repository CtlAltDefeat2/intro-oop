package com.xpanxion.myapp.student14;

public class Square extends Shape{
    //data members
    private int size;
    //constructors


    public Square(int size) {
        this.size = size;
    }

    //methods
    //overrides
    @Override
    public String draw() {
        String star = "";
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if(i == 0 || i == size -1|| j == 0 || j == size - 1)
                    star += "*";
                else
                    star += " ";
            }
            star += "\n";
        }
        return star;
    }

}
