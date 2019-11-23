package com.example.car.data.process;

import org.springframework.data.repository.CrudRepository;

//Persistance layer which acts as database
public interface CarRepository extends CrudRepository<Car,String> {

}
