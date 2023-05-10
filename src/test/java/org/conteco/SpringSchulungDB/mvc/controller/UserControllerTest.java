package org.conteco.SpringSchulungDB.mvc.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.conteco.SpringSchulungDB.mvc.entity.User;
import org.conteco.SpringSchulungDB.mvc.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
class UserControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void testPostUser() throws Exception {

        // Setup UserService Mock
        User user = new User(5L, "Johanna");
        Mockito.when(userService.saveUser(user)).thenReturn(user);

        // Build Post Request
        MockHttpServletRequestBuilder post =
                MockMvcRequestBuilders.post("/users")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(user));

        // Send Post Request and Check Results
        mockMvc.perform(post)
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(5))
                .andExpect(jsonPath("$.name").value("Johanna"));
    }
}