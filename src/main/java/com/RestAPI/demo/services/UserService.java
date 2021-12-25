package com.RestAPI.demo.services;

import com.RestAPI.demo.entity.User;

public interface UserService {

	public Boolean AddUserDetail(User user);
	public User getUserDetial(String username, String password);

}
