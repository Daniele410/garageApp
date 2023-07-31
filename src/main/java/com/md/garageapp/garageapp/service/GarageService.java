package com.md.garageapp.garageapp.service;

import com.md.garageapp.garageapp.model.Car;
import com.md.garageapp.garageapp.repository.GarageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GarageService {

    @Autowired
    private final GarageRepository garageRepository;

    public GarageService(GarageRepository garageRepository) {
        this.garageRepository = garageRepository;
    }

//    static private ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
//            new Car(1, "206", "Peugeot", 2004, Color.BLUE),
//            new Car(2, "testa rossa", "Ferrari", 2020, Color.RED),
//            new Car(3, "Punto", "Fiat", 1999, Color.GREEN),
//            new Car(4, "207", "Peugeot", 2020, Color.YELLOW)
//    ));


    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        garageRepository.findAll().forEach(car -> {
            cars.add(car);
        });
        return cars;
    }

    public Car getCar(long id) {
        return garageRepository.findById(id).orElse(null);
    }

    public void deleteCar(long id) {
        garageRepository.deleteById(id);
    }

    public void addCar(Car car) {
        garageRepository.save(car);
    }

    public void updateCar(Car car, long id) {
        garageRepository.save(car);
    }
}
