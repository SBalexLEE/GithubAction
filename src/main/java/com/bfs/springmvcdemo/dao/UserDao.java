package com.bfs.springmvcdemo.dao;

import com.bfs.springmvcdemo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
    private static final List<User> users;
    private static final User EMPTY_USER = new User(-1, "", "");

    // To keep things simple, we hardcode the data.
    // Usually the DAO should be connected to a SQL database.
    static {
        users = new ArrayList<>();
        users.add(new User(1, "user1", "pass1"));
        users.add(new User(2, "user2", "pass2"));
        users.add(new User(3, "user3", "pass3"));
    }

//    public User getUserById(int id) {
//        return users.stream()
//                .filter(a -> a.getId() == id)
//                .findFirst()
//                .orElse(EMPTY_USER);
//    }
//
//    public void createNewUser(User user) {
//        users.add(user);
//    }

    public List<User> getAllUsers() {
        return users;
    }
}
