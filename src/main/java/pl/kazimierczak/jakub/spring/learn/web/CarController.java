package pl.kazimierczak.jakub.spring.learn.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kazimierczak.jakub.spring.learn.service.CarService;
import pl.kazimierczak.jakub.spring.learn.web.model.CarModel;

import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/cars")
public class CarController {

    private static final Logger LOGGER = Logger.getLogger(CarController.class.getName());

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String carView(){
        LOGGER.info("carView()");

        return "car.html";
    }

    @PostMapping
    public String car(CarModel carModel) {
        LOGGER.info("car(" + carModel + ")");
        carService.car(carModel);

        return "car.html";
    }
}
