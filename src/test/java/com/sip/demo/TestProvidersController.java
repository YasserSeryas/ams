package com.sip.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest
public class TestProvidersController {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testInfo() throws Exception {
        this.mockMvc.perform(get("/providers"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Samsung")))
                .andExpect(content().string(containsString("Orange")))
                .andExpect(content().string(containsString("Hp")));
    }
}
