package com.example.demo.observer;

import com.example.demo.controller.ObserverController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ObserverController.class)
public class Subject {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldUpdateObservers() throws Exception {
        this.mockMvc.perform(get("/observers")).andExpect(status().isOk());
    }
}
