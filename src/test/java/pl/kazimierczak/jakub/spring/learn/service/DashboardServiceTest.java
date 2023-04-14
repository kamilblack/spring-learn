package pl.kazimierczak.jakub.spring.learn.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.kazimierczak.jakub.spring.learn.web.model.DashboardModel;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DashboardServiceTest {

    @Autowired
    private DashboardService dashboardService;

    @Test
    void change() throws Exception {
        // Given


        // When
        Optional<DashboardModel> optionalDashboardModel = dashboardService.change("null");
        DashboardModel dashboardModel = optionalDashboardModel.orElseThrow(() -> new Exception("Unable to find dashboard"));
//        System.out.println(dashboardModel);

        // Then
        Assertions.assertNotNull(dashboardModel, "dashboardModel is null");

    }

    @Test
    void changeException() throws Exception {
        // Given


        // When
        Optional<DashboardModel> optionalDashboardModel = dashboardService.change(null);

        // Then
        Assertions.assertThrows(Exception.class, () -> optionalDashboardModel.orElseThrow(() -> new Exception("Unable to find dashboard")));

    }

    @Test
    void dashboard() {
        // Given
        DashboardModel dashboardModel = new DashboardModel();


        // When
        DashboardModel createdDashboardModel = dashboardService.dashboard(dashboardModel);

        // Then
        Assertions.assertNotNull(createdDashboardModel, "createdDashboardModel is null");

    }
}