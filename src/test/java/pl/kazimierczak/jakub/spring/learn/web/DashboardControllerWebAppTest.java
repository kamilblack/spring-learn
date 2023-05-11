package pl.kazimierczak.jakub.spring.learn.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import pl.kazimierczak.jakub.spring.learn.service.DashboardService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class DashboardControllerWebAppTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void listView() throws Exception {
        // Given


        // When
        mockMvc.perform(get("/dashboards")).andExpect(status().isOk());

        // Then


    }
}