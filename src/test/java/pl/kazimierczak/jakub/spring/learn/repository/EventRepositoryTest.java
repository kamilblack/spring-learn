package pl.kazimierczak.jakub.spring.learn.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.kazimierczak.jakub.spring.learn.repository.entity.EventEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EventRepositoryTest {

    @Autowired
    EventRepository eventRepository;

    @Test
    void test(){
        // Given


        // When
        EventEntity entity = new EventEntity();
        entity.setId(1L);
        entity.setCity("London");
        entity.setName("Human");
        eventRepository.save(entity);

        // Then


    }

}

// TODO: 20.03.2023
// Dopisać testy dla JpaRepository
// C - create - save
// R - read - findById
// U - update - save
// D - delete - deleteById
// L - list - findAll