package com.RestAPI.demo.DaoLayer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RestAPI.demo.entity.User;

public interface UserDao extends JpaRepository<User, String> {

	public User findByUserNameAndPassword(String userName, String password);
	
}
