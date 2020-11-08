package pl.rybialek.backend.web.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import pl.rybialek.backend.service.UserService;

import java.util.Collections;

@RunWith(SpringRunner.class)
public class ApiTest {

    private MockMvc mockMvc;

    @Mock
    private UserService userService;

    @InjectMocks
    private Api api;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(api).build();
    }

    @Test
    public void shouldSuccessfullyResponseFromHello() throws Exception {
        // given
        Mockito.when(userService.findAll()).thenReturn(Collections.emptyList());

        // when & then
        mockMvc.perform(MockMvcRequestBuilders.get("/hello1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("home"))
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().hasNoErrors());
    }
}
