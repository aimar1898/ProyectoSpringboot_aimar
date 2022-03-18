package com.aimar.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.aimar.entities.State;

public interface StatesCRUDRepository extends CrudRepository<State, Integer> {

}