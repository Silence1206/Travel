package com.etc.travel.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.etc.travel.entity.User;

public interface UserDao {

	@Select("select * from users where username = #{username} and password = #{password} limit 1")
	public User login(@Param("username") String username,
			@Param("password") String password);

}
