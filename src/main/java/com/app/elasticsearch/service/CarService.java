package com.app.elasticsearch.service;

import java.util.List;

import com.app.elasticsearch.model.Car;

public interface CarService {
	
	List<String> Brands = List.of("Hyundai","Honda","Volkswagen"); 
	List<String> Colors = List.of("Red","Black","White"); 
	List<String> Types = List.of("Sedan","SUV","MPV"); 
	
	Car generateCar();
}
