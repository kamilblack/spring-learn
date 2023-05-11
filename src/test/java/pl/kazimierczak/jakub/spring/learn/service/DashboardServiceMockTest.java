package pl.kazimierczak.jakub.spring.learn.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.kazimierczak.jakub.spring.learn.web.model.DashboardModel;

@SpringBootTest
class DashboardServiceMockTest {

    @Autowired
    private DashboardService dashboardService;

    private DashboardService dashboardServiceMock = Mockito.mock(DashboardService.class);

    @Test
    void dashboardWithMock() {
        // Given
        DashboardModel dashboardModel = new DashboardModel("Mail", "7850");

        // When
        Mockito.when(dashboardServiceMock.dashboard(dashboardModel)).thenReturn(new DashboardModel("Monaco", "1450"));
        DashboardModel dashboard = dashboardServiceMock.dashboard(dashboardModel);
        System.out.println(dashboard);

        // Then


    }

    @Test
    void dashboardWithAutowired() {
        // Given
        DashboardModel dashboardModel = new DashboardModel("Mail", "7850");

        // When
//        Mockito.when(dashboardServiceMock.dashboard(dashboardModel)).thenReturn(new DashboardModel("Monaco", "1450"));
        DashboardModel dashboard = dashboardService.dashboard(dashboardModel);


        // Then


    }
}