package com.andres.curso.seccion5.springboot.error.springboot_error.services;

import java.util.List;

import javax.swing.plaf.basic.BasicListUI.ListDataHandler;

import com.andres.curso.seccion5.springboot.error.springboot_error.models.domain.User;

public interface UserService {

    List<User> findAll();
    User findById(Long id);

}
