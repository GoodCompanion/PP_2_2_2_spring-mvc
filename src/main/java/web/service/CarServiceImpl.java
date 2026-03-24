package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("Tesla Model 3", 250, 4));
        cars.add(new Car("BMW M5", 305, 4));
        cars.add(new Car("Lada Vesta", 180, 4));
        cars.add(new Car("Ferrari F8", 340, 2));
        cars.add(new Car("Mercedes S-Class", 280, 4));
    }


    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(int count) {
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(cars.get(i));
        }
        return list;
    }
}
