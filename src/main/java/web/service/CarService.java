package web.service;

import org.springframework.stereotype.Service;
import web.entity.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class CarService {
    private List<Car> carList = Arrays.asList(new Car("Zapor", 22, 1985),
            new Car("Mers", 2, 2000),
            new Car("Bmw", 3, 2005),
            new Car("Lada", 1, 1999),
            new Car("Uaz", 44, 1990));
    public List<Car> getAllCars(){
        return carList;
    }
    public List<Car> getSomeCars(int n){
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(carList.get(i));
        }
        return list;
    }

}
