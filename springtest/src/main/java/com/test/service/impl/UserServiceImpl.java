package com.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.dao.UserDao;
import com.test.entity.UserEntity;
import com.test.service.UserService;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public boolean checkUser(UserEntity userEntity) {
		UserEntity userEntityResult = userDao.findUser(userEntity);
		
		if (userEntityResult != null && userEntityResult.getUserName() != null 
				&& userEntityResult.getPassWord() != null){
			return true;
		}
		
		return false;
	}

}
