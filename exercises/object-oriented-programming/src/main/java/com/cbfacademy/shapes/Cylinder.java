package com.cbfacademy.shapes;

public class Cylinder extends Shape {
    private double height;
    private double radius;    
    
    public Cylinder(double radius, double height){
        //constructor
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getArea() {
        //overrides the base method. The value is given by the formula (height * 𝛑 * (radius2)).
        return height * Math.PI * (Math.pow(radius, 2));
    }

}
