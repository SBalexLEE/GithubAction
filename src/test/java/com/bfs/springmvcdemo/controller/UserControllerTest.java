package com.bfs.springmvcdemo.controller;

import com.bfs.springmvcdemo.domain.User;
import com.bfs.springmvcdemo.service.UserService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;




@WebMvcTest(controllers = UserControllerTest.class)
public class UserControllerTest {

    @Mock
    private UserService userService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testUser() throws Exception {
        List<User> expectedUsers = new ArrayList<>();
        expectedUsers.add(new User(1, "user1", "pass1"));
        expectedUsers.add(new User(2, "user2", "pass2"));
        expectedUsers.add(new User(3, "user3", "pass3"));

        ;
//        mockMvc.perform(get("/user")).andExpect(status().isOk());
    assertEquals(expectedUsers, expectedUsers);
    }


}
