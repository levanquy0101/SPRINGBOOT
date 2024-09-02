package com.example.myappbe.services;

import com.example.myappbe.dto.UserDTO;
import com.example.myappbe.entities.User;

import java.util.List;

public interface IUserService {
    boolean existsByUsername(String admin);

    User save(User user);

    User findById(Long id);
//    Optional<User> findById(Long id);

    User findByUsername(String username);
    UserDTO convertToDTO(User user);


    //    List<User> findAllUserNotIn();
    List<User> findAllEmployeeExceptRoles(List<String> roleNames);

    void deleteEmployee(Long id);
    String generateEmployeeCode();

    void update(Long id, User user);
}