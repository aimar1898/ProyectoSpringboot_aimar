package com.aimar.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.aimar.entities.Calendar;

public interface CalendarsCRUDRepository extends CrudRepository<Calendar, Integer> {

}