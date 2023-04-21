package pl.kazimierczak.jakub.spring.learn.service.mapper;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kazimierczak.jakub.spring.learn.repository.entity.CarEntity;
import pl.kazimierczak.jakub.spring.learn.web.model.CarModel;

import static org.junit.jupiter.api.Assertions.*;

class CarMapperTest {

    private CarMapper carMapper = new CarMapper();

    @Test
    void fromModelToEntity() {
        // Given
//        CarMapper carMapper = new CarMapper();
        CarModel carModel = new CarModel("Audi", 55000);

        // When
        CarEntity mappedCarEntity = carMapper.from(carModel);

        // Then
        Assertions.assertNotNull(mappedCarEntity, "mappedCarEntity is null");

    }

    @Test
    void fromEntityToModel() {
        // Given
//        CarMapper carMapper = new CarMapper();
        CarEntity carEntity = new CarEntity("Fiat", 25000);

        // When
        CarModel mappedCarModel = carMapper.from(carEntity);

        // Then
        Assertions.assertNotNull(mappedCarModel, "mappedCarModel is null");

    }

    @Test
    void givenCarEntity_whenFromCarEntityToCarModel_thenAttributesEqual() {
        // Given
        CarEntity carEntity = new CarEntity();
        carEntity.setId(50L);
        carEntity.setName("Seat");
        carEntity.setPrice(3300);

        // When
        CarModel mappedCarModel = carMapper.from(carEntity);

        // Then
        assertEquals(carEntity.getId(), mappedCarModel.getId(), "IDs are not equals");
        assertEquals(carEntity.getName(), mappedCarModel.getName(), "Names are not equals");
        assertEquals(carEntity.getPrice(), mappedCarModel.getPrice(), "Prices are not equals");

    }
}