package com.md.garageapp.garageapp.repository;

import com.md.garageapp.garageapp.model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarageRepository extends CrudRepository<Car, Long> {
}
