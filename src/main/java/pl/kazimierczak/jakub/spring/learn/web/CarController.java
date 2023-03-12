package pl.kazimierczak.jakub.spring.learn.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/car")
public class CarController {

    private static final Logger LOGGER = Logger.getLogger(CarController.class.getName());

    @GetMapping
    public String car(String name, String price){
        LOGGER.info("car()");

        return "car.html";
    }
}
