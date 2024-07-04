package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;


public interface CarService {

    List<Car> getAllCars();
    void addedCars ();
    List<Car> getCarsByCount(Integer count);

}
