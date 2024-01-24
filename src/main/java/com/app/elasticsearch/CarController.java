package com.app.elasticsearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.elasticsearch.model.Car;
import com.app.elasticsearch.service.CarService;
@RestController
@RequestMapping("/api/car/v1")
public class CarController {

	@Autowired
	private CarService carService;
	
	@GetMapping(value = "/random", produces = MediaType.APPLICATION_JSON_VALUE)
	public Car getCar()
	{
		return carService.generateCar();
	}
	
}
