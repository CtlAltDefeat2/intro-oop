package com.xpanxion.myapp.student23;

public class Square extends Shape {
    int side;
    public Square(int side) {
        this.side = side;

    }

    @Override
    public String draw() {
        String square ="";
        for(int row = 0; row < side; row++) {
            if(row == 0 || row == side-1){
                for(int column = 0; column < side; column++){
                    square += "*";
                }
                square += "\n";
            }
            else{
                for(int column = 0; column < side; column++){
                    if(column == 0 || column == side-1){
                        square += "*";
                    }
                    else{
                        square += " ";
                    }
                }
                square += "\n";
            }

        }
        return square;
    }
}
