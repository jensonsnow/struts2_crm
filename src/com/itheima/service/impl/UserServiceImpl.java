package com.itheima.service.impl;

import java.util.List;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.domain.User;
import com.itheima.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		UserDao  userDao =  (UserDao) new UserDaoImpl();
		return userDao.login(user);
	}

	 
}
