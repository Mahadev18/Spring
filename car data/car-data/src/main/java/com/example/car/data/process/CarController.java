package com.example.car.data.process;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

	//Presentation layer
	
	@Autowired
	private CarService carservice;
	
	// To retrieve  all the car objects 
	@RequestMapping(method = RequestMethod.GET, value = "/cars" )
	public List<Car> getAllCars()
	{
		return carservice.getAllCars();		
	}
	
	//To retrieve specified car object  
	@RequestMapping(method = RequestMethod.GET, value = "/cars/{Model_name}")
	public Optional<Car> getCar(@PathVariable String Model_name)
	{
		return carservice.getCar(Model_name);
	}
	
	// To add the car objects into the database
	@RequestMapping(method = RequestMethod.POST, value = "/cars")
	public void addCars(@RequestBody Car car)
	{
		carservice.addCars(car);
	}
	
	// To update the specified Car object 
	@RequestMapping(method = RequestMethod.PUT, value = "/cars/{Model_name}")
	public void editCars(@RequestBody Car car,@PathVariable String Model_name)
	{
		carservice.editCars(Model_name,car);
	}
	
	//To delete the specified car object
	@RequestMapping(method = RequestMethod.DELETE, value = "/cars")
	public void deleteCar(@RequestBody Car car,@PathVariable String Model_name)
	{
		carservice.deleteCar(Model_name,car); 
	}
}
  