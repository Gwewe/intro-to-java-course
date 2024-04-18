package com.cbfacademy.cars;

import java.util.ArrayList;
import java.util.List;

public class Showroom {
    public List<Car> getCars(){
        List<Car> cars = new ArrayList<>();

        Car carOne = new Car("blue", "Volvo", "V40", 2012);
        Car carTwo = new Car("red", "Porsche", "Panamera", 2009);
        Car carThree = new Car("grey", "Audi", "A3", 2018);

        cars.add(carOne);
        cars.add(carTwo);
        cars.add(carThree);

        return cars;

    }
};
