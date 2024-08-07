package web.service;

import web.entity.Car;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();

    List<Car> getSomeCars(int n);
}
