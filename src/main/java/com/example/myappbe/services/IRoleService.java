package com.example.myappbe.services;

import com.example.myappbe.entities.Role;

import java.util.List;

public interface IRoleService {
    //    Optional<Role> existByName(String name);
    Role findByName(String name);

    void save(Role adminRole);

    List<Role> findAll();

    List<Role> findByNameNotIn(List<String> names);
}