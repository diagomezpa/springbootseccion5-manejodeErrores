package com.andres.curso.seccion5.springboot.error.springboot_error.services;

import java.util.ArrayList;
import java.util.List;

import com.andres.curso.seccion5.springboot.error.springboot_error.models.domain.User;

public class UserServiceImpl implements UserService {

    private List<User> users;

    public UserServiceImpl(List<User> users) {
        this.users = new ArrayList<>();
        this.users.add(new User(1L, "Andres", "Guzman"));
        this.users.add(new User(2L, "Maria", "Guzman"));
        this.users.add(new User(3L, "John", "Doe"));
        this.users.add(new User(4L, "Jane", "Doe"));
        this.users.add(new User(5L, "Bob", "Smith"));
        
    }

    @Override
    public List<User> findAll() {
        // TODO Auto-generated method stub
        return users;
    }

    @Override
    public User findById(Long id) {
        // TODO Auto-generated method stub
        User user = null;
        for (User u : users) {
            if (u.getId().equals(id)) {
                user = u;
                break;
            }
        }
        return user;
    }

}
