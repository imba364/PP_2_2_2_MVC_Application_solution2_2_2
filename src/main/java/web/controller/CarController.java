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


    @GetMapping(value = "/cars")
    public String getAllCars(@RequestParam(required = false, defaultValue = "5") Integer count, Model model) {
       carService.addedCars();
        if ((count != null) && (count >= 0)) {
            if (count > 5) {
                count = 5;
            }
            model.addAttribute("cars",carService.getCarsByCount(count));
        } else {
            model.addAttribute("cars",carService.getAllCars());
        }
        return "cars";
    }
    }

