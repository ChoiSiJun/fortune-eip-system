package com.eip.fortune.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = MainController.class)
public class MainControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    @DisplayName("Main_connection_test_ok")
    public void connectionMainTest() throws Exception{
        mvc.perform(get("/main")).andExpect(status().isOk());
    }
}
