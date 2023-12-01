package com.example.springbootsecurity.service;


import com.example.springbootsecurity.model.Role;


public interface RoleService {
    Iterable<Role> findAll();

    void save(Role role);

    Role findByName(String name);
}
