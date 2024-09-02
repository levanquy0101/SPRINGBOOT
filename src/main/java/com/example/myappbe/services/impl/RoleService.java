package com.example.myappbe.services.impl;

import com.example.myappbe.entities.Role;
import com.example.myappbe.repositories.IRoleRepo;
import com.example.myappbe.services.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private IRoleRepo iRoleRepo;

//    @Override
//    public Optional<Role> existByName(String name) {
//        return iRoleRepo.existByName(name);
//    }

    @Override
    public Role findByName(String name) {
        return iRoleRepo.findByName(name);
    }

    @Override
    public void save(Role adminRole) {
        iRoleRepo.save(adminRole);
    }

    @Override
    public List<Role> findAll() {
        return iRoleRepo.findAll();
    }

    @Override
    public List<Role> findByNameNotIn(List<String> names) {
        return iRoleRepo.findByNameNotIn(names);
    }
}
