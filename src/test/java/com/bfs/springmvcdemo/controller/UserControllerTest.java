package com.bfs.springmvcdemo.controller;

import com.bfs.springmvcdemo.domain.User;
import com.bfs.springmvcdemo.service.UserService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class UserControllerTest {

    private final UserService userService;

    @Autowired
    public UserControllerTest(UserService userService) {
        this.userService = userService;
    }


    @Test
    void testUser(){
        List<User> expectedUsers = new ArrayList<>();
        expectedUsers.add(new User(1, "user1", "pass1"));
        expectedUsers.add(new User(2, "user2", "pass2"));
        expectedUsers.add(new User(3, "user3", "pass3"));

        assertEquals(expectedUsers, userService.getAllUsers());

    }


}
