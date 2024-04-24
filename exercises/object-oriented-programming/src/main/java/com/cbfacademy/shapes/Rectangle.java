package com.cbfacademy.shapes;

public class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        //constructor
        this.length = length;
        this.width = width;
        super.name = "Rectangle";
    }   

    @Override
    public double getArea(){
        //overrides the base method. The value is given by the formula (length * width)
        return length * width;
    }

}
