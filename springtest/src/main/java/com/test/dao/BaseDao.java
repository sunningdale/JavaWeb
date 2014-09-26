package com.test.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseDao<E> {

	@Autowired
	private SqlSession sqlsession;

	@SuppressWarnings("unchecked")
	public E findByOther(String statementName, Object parameterObject) {
		return (E) sqlsession.selectOne(statementName, parameterObject);
	}
}
