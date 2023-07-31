package com.md.garageapp.garageapp.service;

import com.md.garageapp.garageapp.model.Car;
import com.md.garageapp.garageapp.model.Color;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GarageService {

    static private ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
            new Car("206", "Peugeot", 2004, Color.BLUE),
            new Car("206", "Peugeot", 2004, Color.BLUE),
            new Car("206", "Peugeot", 2004, Color.BLUE),
            new Car("206", "Peugeot", 2004, Color.BLUE)
    ));

    public List<Car> getCars(){
        return cars;
    }

}
