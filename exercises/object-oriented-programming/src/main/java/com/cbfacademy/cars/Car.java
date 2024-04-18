package com.cbfacademy.cars;


public class Car {
    private String make;
    private String model;
    private String colour;
    private int year;

    /*The constructor this.colour, this.make, this.model, this.year*/
    public Car(String colour, String make, String model, int year) {
        this.colour = colour;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    /*Method to return car make */
    public String getMake(){
        String carMake = this.make;

        return carMake;
    }

    /*Method to return the car model */
    public String getModel(){
        String carModel = this.model;

        return carModel;
    }

    /*Method to return years when car was made */
    public int getYear(){
        Integer carYear = this.year;

        return carYear;
    }



    /*method to get colour of car */
    public String getColour() {
        String carColour = this.colour;

        return carColour;
    } 



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