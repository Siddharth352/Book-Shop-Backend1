                                                                                                                                                                                                                                                                                                                                                                                                            package com.RestAPI.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestAPI.demo.DaoLayer.UserDao;
import com.RestAPI.demo.entity.User;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userdao;

	@Override
	public Boolean AddUserDetail(User user) {
		// TODO Auto-generated method stub
		
		User save = userdao.save(user);
		System.out.println(save);
		return true;
	}

	@Override
	public User getUserDetial(String userName, String password) {
		// TODO Auto-generated method stub
		User findByUsernameAndPassword = userdao.findByUserNameAndPassword(userName, password);
		System.out.println(findByUsernameAndPassword);
		return findByUsernameAndPassword;
	}

}
