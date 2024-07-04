package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {
    List<Car> cars = new ArrayList<>();

    @Override
    public void addedCars() {
        cars.add(new Car("Audi", "Black", 2));
        cars.add(new Car("BMW", "Blue", 3));
        cars.add(new Car("Mercedes", "Red", 4));
        cars.add(new Car("Volkswagen", "Green", 5));
        cars.add(new Car("Toyota", "Yellow", 6));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
  public List<Car> getCarsByCount(Integer count) {

        if (count == null || count >= cars.size()) {
            return cars;

        } else if (count <= 0) {
            return new ArrayList<>();

        } else {
            return cars.subList(0, count);
        }
    }
}


