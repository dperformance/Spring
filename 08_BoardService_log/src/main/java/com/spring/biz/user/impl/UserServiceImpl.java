package com.spring.biz.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.biz.user.UserService;
import com.spring.biz.user.UserVO;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDAO;
	
	public UserServiceImpl() {
		System.out.println(">> UserServiceImpl() 실행~~");
	}
	
	@Override
	public UserVO getUser(UserVO uvo) {
		return userDAO.getUser(uvo);
	}

	@Override
	public List<UserVO> getUserList() {
		return userDAO.getUserList();
	}

}
