package com.cbfacademy.cars;


public class Car {
    private String make;
    private String model;
    private String colour;
    private int year;

    /*The constructor this.colour, this.make, this.model, this.year*/
    public Car(String make, String model, String colour, int year) {
        this.colour = colour;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    /*Method to return car make */
    public String getMake(){
        return make;
    }

    /*Method to return the car model */
    public String getModel(){
        return model;
    }

    /*Method to return years when car was made */
    public int getYear(){
        return this.year;
    }


    /*method to get colour of car */
    public String getColour() {
        return this.colour;
    } 
//String make, String model, String colour, int year


    /* Method to set the colour*/
    public void setColour(String newColour) {
        this.colour = newColour;
    }
    
    /*Method to get the car details, including the make, model, colour and year */
    public String getDetails(){
        String carDetails = String.format(
            "a %s %s %s from %s", 
            this.colour, this.make, this.model, this.year
            );
            /*format model: a blue Volvo V40 from 2012 */

        return carDetails;
    };    

};