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
            new Car(1,"206", "Peugeot", 2004, Color.BLUE),
            new Car(2,"testa rossa", "Ferrari", 2020, Color.RED),
            new Car(3,"Punto", "Fiat", 1999, Color.GREEN),
            new Car(4,"207", "Peugeot", 2020, Color.YELLOW)
    ));

    public List<Car> getCars(){
        return cars;
    }

    public Car getCar(long id) {
        return cars.stream().filter(car -> car.getId() == id).findFirst().orElse(null);
    }
}
