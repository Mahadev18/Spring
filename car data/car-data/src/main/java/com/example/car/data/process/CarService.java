package com.example.car.data.process;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarService {
	
	//Service layer
	
	@Autowired
	private CarRepository carRepository;
	
	public List<Car> getAllCars()
	{
		List<Car> car = new ArrayList<>();
		carRepository.findAll().forEach(car::add);
		return car;
	}
	
	public Optional<Car> getCar(String model_name)
	{
		return carRepository.findById(model_name);
	}

	public void addCars(Car car) {
		carRepository.save(car);
	}

	public void editCars(String model_name, Car car) {
			carRepository.save(car);
		
	}

	public void deleteCar(String model_name, Car car) {
		carRepository.delete(car);
	}
		

	


}
