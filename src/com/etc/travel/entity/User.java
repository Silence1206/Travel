package com.etc.travel.entity;

public class User {
	
	private String userid; //  setUserid    userid  setUserid
	private String username;
	private String password;
	private String userphone;
	private String email;
	private String sex;
	private String userstate;
	private String nickname;
	private int usercopunt;
	
	
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getUserstate() {
		return userstate;
	}
	public void setUserstate(String userstate) {
		this.userstate = userstate;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getUsercopunt() {
		return usercopunt;
	}
	public void setUsercopunt(int usercopunt) {
		this.usercopunt = usercopunt;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		//��������set����ȷ����set֮��ĵ�������ĸСд������������
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
