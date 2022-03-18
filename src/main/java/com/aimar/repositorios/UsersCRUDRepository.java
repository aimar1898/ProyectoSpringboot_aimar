package com.aimar.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.aimar.entities.User;

public interface UsersCRUDRepository extends CrudRepository<User, Integer> {

	@Query("from User as u where u.user=:user and u.password=:password")
	//Solo puede dar un ÚNICO objeto con la misma clave y la misma contraseña
	public User getLogin(String user, String password);


}