package com.test.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.test.dao.BaseDao;
import com.test.dao.UserDao;
import com.test.entity.UserEntity;

public class UserDaoImpl extends BaseDao<UserEntity> implements UserDao{

	@Override
	public UserEntity findUser(UserEntity userEntity) {
		Map<String,String> map = new HashMap<String,String>();
		UserEntity useEntity = findByOther("",map);
		return useEntity;
	}
}
