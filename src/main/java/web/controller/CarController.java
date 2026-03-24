package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars", produces = "text/html;charset=UTF-8")
    public String showCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> cars;

        if (count != null && count > 0) {
            cars = carService.getCars(count);  // ← сервис сам решит, сколько вернуть
        } else {
            cars = carService.getAllCars();    // ← все машины
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
