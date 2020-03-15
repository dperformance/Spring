package com.spring.biz.user;

import java.util.List;

public interface UserService {

	UserVO getUser(UserVO uvo);
	List<UserVO> getUserList();
}
