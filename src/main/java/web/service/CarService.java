package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    Car getCars(List<Car> cars, int count);
}
