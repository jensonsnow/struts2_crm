package com.itheima.web.action;

import org.apache.struts2.ServletActionContext;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	
	private User user = new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	public String login() {
		UserService userService = new UserServiceImpl();
		User existUser = userService.login(user);
		System.out.println(existUser);
		
		if(existUser == null) {
			this.addActionError("用户名或者密码错误");
			return LOGIN;
		}else {
			//ActionContext.getContext().getSession().put("existUser", existUser)
			ServletActionContext.getRequest().getSession().setAttribute("existUser", existUser);
			return SUCCESS;
		}
		
	}
}
