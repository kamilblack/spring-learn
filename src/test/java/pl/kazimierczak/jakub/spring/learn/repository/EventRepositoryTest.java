package pl.kazimierczak.jakub.spring.learn.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.kazimierczak.jakub.spring.learn.repository.entity.DashboardEntity;
import pl.kazimierczak.jakub.spring.learn.repository.entity.EventEntity;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EventRepositoryTest {

    @Autowired
    EventRepository eventRepository;

    @Test
    void create(){
        // Given


        // When
        EventEntity entity = new EventEntity();
        entity.setCity("Berlin");
        entity.setName("Cars");
        eventRepository.save(entity);

        EventEntity entityCompare = eventRepository.findById(entity.getId()).get();

        // Then
        Assertions.assertThat(entityCompare).isEqualTo(entity);

    }

    @Test
    void update(){
        // Given


        // When
        EventEntity entity = new EventEntity();
        entity.setId(1L);
        entity.setCity("London");
        entity.setName("Human");
//        eventRepository.save(entity);
//        eventRepository.persist(entity);
        // Then


    }

    @Test
    void readById(){
        // Given


        // When
        EventEntity entity = new EventEntity();


        // Then


    }

    @Test
    void deleteById(){
        // Given


        // When


        // Then


    }

    @Test
    void findAll(){
        // Given


        // When
        List<EventEntity> events = eventRepository.findAll();
        System.out.println(events);

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