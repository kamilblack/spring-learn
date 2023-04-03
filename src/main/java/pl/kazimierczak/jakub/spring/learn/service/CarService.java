package pl.kazimierczak.jakub.spring.learn.service;

import org.springframework.stereotype.Service;
import pl.kazimierczak.jakub.spring.learn.web.model.CarModel;

import java.util.Optional;
import java.util.logging.Logger;

@Service
public class CarService {

    private static final Logger LOGGER = Logger.getLogger(CarService.class.getName());


    public Optional<CarModel> verify(String name){

        if (name == null) {
            Optional<CarModel> empty = Optional.empty();
            return empty;
        } else {
            Optional<CarModel> carModelOptional = Optional.of(new CarModel(name, 10000));
            return carModelOptional;
        }

    }



}
