package com.cbfacademy.cars;

public class cars {
    private String make;
    private String model;
    private String colour;
    private int year;

    /*The constructor */
    public cars(String make, String model, String colour, int year) {
        this.make = make;
        this.model = model;
        this.colour = colour;
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
            "The car make is %s, the car model is %s, the car colour is %s, and the car year is %s", 
            this.make, this.model, this.colour, this.year
            );

        return carDetails;
    };

};