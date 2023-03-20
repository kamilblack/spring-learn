package pl.kazimierczak.jakub.spring.learn.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.kazimierczak.jakub.spring.learn.repository.entity.DashboardEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DashboardRepositoryTest {

    @Autowired
    private DashboardRepository dashboardRepository;

    @Test
    void test(){
        // Given


        // When
        List<DashboardEntity> dashboards = dashboardRepository.findAll();
        System.out.println(dashboards);

        // Then


    }

}