package pl.kazimierczak.jakub.spring.learn.service;

import org.springframework.stereotype.Service;
import pl.kazimierczak.jakub.spring.learn.repository.CarRepository;
import pl.kazimierczak.jakub.spring.learn.repository.entity.CarEntity;
import pl.kazimierczak.jakub.spring.learn.service.mapper.CarMapper;
import pl.kazimierczak.jakub.spring.learn.web.model.CarModel;

import java.util.Optional;
import java.util.logging.Logger;

@Service
public class CarService {

    private static final Logger LOGGER = Logger.getLogger(CarService.class.getName());

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public CarService(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    public CarModel car(CarModel carModel){
        LOGGER.info("car(" + carModel + ")");

//        implementacja zastąpiona mapperem
//        CarEntity carEntity = new CarEntity();
//        carEntity.setName(carModel.getName());
//        carEntity.setPrice(carModel.getPrice());
//        carRepository.save(carEntity);

        CarEntity carEntity = carMapper.from(carModel);
        CarEntity savedCarEntity = carRepository.save(carEntity);
        CarModel mappedCarModel = carMapper.from(savedCarEntity);

        LOGGER.info("car(...) = " + mappedCarModel);

        return mappedCarModel;
    }

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
