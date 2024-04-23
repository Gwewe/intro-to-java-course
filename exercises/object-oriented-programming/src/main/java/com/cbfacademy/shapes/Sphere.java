package com.cbfacademy.shapes;

public class Sphere extends Shape {
    private double radius;
    
    public Sphere(double radius){
        //constructor
        this.radius = radius;
    }

    @Override
    public double getArea() {
        //overrides the base method. The value is given by the formula (4 * 𝛑 * (radius2))
        return 4 * Math.PI * (Math.pow(radius, 2));
    }

}
