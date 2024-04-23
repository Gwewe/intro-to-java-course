package com.cbfacademy.shapes;

public abstract class Shape {
    String Name;
    
    public abstract double getArea();
    //returns the area of the shape
    
    
    public String getName() {
        // returns name of shape
        return this.Name;
    }
    

};
