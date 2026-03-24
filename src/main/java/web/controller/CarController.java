package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("model1", 50, 6));
        cars.add(new Car("model2", 75, 5));
        cars.add(new Car("model3", 100, 4));
        cars.add(new Car("model4", 125, 3));
        cars.add(new Car("model5", 150, 2));

        return "index";
    }
}
