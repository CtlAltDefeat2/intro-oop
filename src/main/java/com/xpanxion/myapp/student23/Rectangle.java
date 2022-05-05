package com.xpanxion.myapp.student23;

public class Rectangle extends Shape {
    int height;
    int width;
    public Rectangle(int width, int height) {

        this.height = height;
        this.width = width;
    }

    @Override
    public String draw() {
        String rectangle ="";
        for(int row = 0; row < height; row++) {
            if(row == 0 || row == height-1){
                for(int column = 0; column < width; column++){
                    rectangle += "*";
                }
                rectangle += "\n";
            }
            else{
                for(int column = 0; column < width; column++){
                    if(column == 0 || column == width-1){
                        rectangle += "*";
                    }
                    else{
                        rectangle += " ";
                    }
                }
                rectangle += "\n";
            }

        }
        return rectangle;
    }
}
