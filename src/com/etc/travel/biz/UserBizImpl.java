package com.etc.travel.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etc.travel.dao.UserDao;
import com.etc.travel.entity.User;

@Service(value="userBiz")
public class UserBizImpl implements UserBiz{
	
	@Autowired
	private UserDao userDao;
	
	public User login(String username, String password) {
		User user = userDao.login(username, password);
		return user;
	}

}
