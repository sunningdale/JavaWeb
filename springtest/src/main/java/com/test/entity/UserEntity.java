package com.test.entity;

import java.io.Serializable;

public class UserEntity implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1238608476864417206L;
	
	private String userName;
	
	private String passWord;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
