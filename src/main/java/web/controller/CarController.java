package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.entity.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService service;

    @Autowired
    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping
    public String printCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        List<Car> carList;
        if (count == null) {
            carList = service.getAllCars();
        } else {
            carList = service.getSomeCars(count);
        }
        model.addAttribute("carList", carList);
        return "car";
    }
}
