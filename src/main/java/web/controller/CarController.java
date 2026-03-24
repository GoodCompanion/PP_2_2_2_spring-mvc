package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars", produces = "text/html;charset=UTF-8")
    public String showCars(Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("model1", 50, 6));
        cars.add(new Car("model2", 75, 5));
        cars.add(new Car("model3", 100, 4));
        cars.add(new Car("model4", 125, 3));
        cars.add(new Car("model5", 150, 2));
        model.addAttribute("cars", cars);
        return "cars";
    }
}
