package pl.kazimierczak.jakub.spring.learn.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.kazimierczak.jakub.spring.learn.web.model.CarModel;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarServiceTest {

    @Autowired
    private CarService carService;

    @Test
    void verifyWithNullValue(){

        // Given


        // When
        Optional<CarModel> verifyCarModelOptional = carService.verify(null);

        // Then
        Assertions.assertThrows(Exception.class, () -> verifyCarModelOptional.orElseThrow(() -> new Exception("Unable to find car")));

    }

    @Test
    void verifyWithNotNullValue() throws Exception {

        // Given


        // When
        Optional<CarModel> optionalCarModel = carService.verify("Kia");
//        Optional to wrapper zawierający <> - w tym przypadku CarModel
        System.out.println("#### " + optionalCarModel);
        CarModel carModel = optionalCarModel.orElseThrow(() -> new Exception("unable to find car"));

        // Then
        Assertions.assertNotNull(carModel, "carModel is null");

    }
}