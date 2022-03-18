package com.aimar.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.aimar.entities.Role;

public interface RolesCRUDRepository extends CrudRepository<Role, Integer> {

}