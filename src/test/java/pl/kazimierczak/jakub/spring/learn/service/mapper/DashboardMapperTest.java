package pl.kazimierczak.jakub.spring.learn.service.mapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pl.kazimierczak.jakub.spring.learn.repository.entity.DashboardEntity;
import pl.kazimierczak.jakub.spring.learn.web.model.DashboardModel;

import static org.junit.jupiter.api.Assertions.*;

class DashboardMapperTest {

    @Test
    void from() {
        // Given
        DashboardMapper dashboardMapper = new DashboardMapper();
        DashboardModel dashboardModel = new DashboardModel("Cup", "28");


        // When
        DashboardEntity mappedDashboardEntity = dashboardMapper.from(dashboardModel);

        // Then
        Assertions.assertNotNull(mappedDashboardEntity, "mappedDashboardEntity is null");


    }
}

// TODO: 07.04.2023
// Dopisać testy sprawdzające poszczególne pola (name, size)