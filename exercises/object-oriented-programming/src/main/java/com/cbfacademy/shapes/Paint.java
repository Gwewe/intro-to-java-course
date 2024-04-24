package com.cbfacademy.shapes;


public class Paint {

    private double coverage;

    public Paint(double coverage) {
        // constructor that accepts a parameter representing the number of square feet per gallon this paint can cover
        this.coverage = coverage;
    }
    
    
    public double getAmount(Shape shape) {
        //returns the amount of paint (measured in gallons) needed to paint a given shape
        return shape.getArea() / coverage;
    }

}
