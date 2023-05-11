package pl.kazimierczak.jakub.spring.learn.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(controllers = AccountController.class)
class AccountControllerWebLayerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void accounts() throws Exception {
        // Given


        // When
        mockMvc.perform(get("/accounts")).andExpect(status().isOk());

        // Then


    }
}