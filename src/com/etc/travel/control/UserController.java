package com.etc.travel.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.travel.biz.UserBiz;
import com.etc.travel.entity.User;

@Controller //��������
public class UserController {

	@Autowired
	private UserBiz userBiz;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request,String username,String password){
		User user = userBiz.login(username, password);
		if(user!=null){//��½�ɹ�
			request.getSession().setAttribute("user", user);
			return  "index";
			
		}
		request.setAttribute("msg", "�������");
		return "login/login";
	}
}
