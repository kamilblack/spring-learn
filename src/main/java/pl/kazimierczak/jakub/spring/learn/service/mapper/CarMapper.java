package pl.kazimierczak.jakub.spring.learn.service.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import pl.kazimierczak.jakub.spring.learn.repository.entity.CarEntity;
import pl.kazimierczak.jakub.spring.learn.web.model.CarModel;

import java.util.logging.Logger;

@Component
public class CarMapper {

    private static final Logger LOGGER = Logger.getLogger(CarMapper.class.getName());

    public CarEntity from(CarModel carModel){
        LOGGER.info("from(" + carModel +")");

        ModelMapper modelMapper = new ModelMapper();
        CarEntity carEntity = modelMapper.map(carModel, CarEntity.class);

        LOGGER.info("from(...) = " + carEntity);

        return carEntity;
    }

    public CarModel from(CarEntity carEntity) {
        LOGGER.info("from(" + carEntity + ")");

        ModelMapper modelMapper = new ModelMapper();
        CarModel carModel = modelMapper.map(carEntity, CarModel.class);

        LOGGER.info("from(...) = " + carModel);

        return carModel;
    }

}
