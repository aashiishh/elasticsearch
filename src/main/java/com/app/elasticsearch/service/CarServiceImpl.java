package com.app.elasticsearch.service;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import com.app.elasticsearch.model.Car;

@Service
public class CarServiceImpl implements CarService {

	@Override
	public Car generateCar() {
		var brand = Brands.get(ThreadLocalRandom.current().nextInt(Brands.size()));
		var color = Colors.get(ThreadLocalRandom.current().nextInt(Colors.size()));
		var type = Types.get(ThreadLocalRandom.current().nextInt(Types.size()));
		
		
		return new Car(brand, color, type);
	}

}
