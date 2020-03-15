package com.spring.biz.user;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.biz.user.UserService;

public class UserServiceClient {

	public static void main(String[] args) {
		/* 기존에 스프링을 사용안하고 사용했던 방법
		UserDAO dao = new UserDAO();
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test");
		System.out.println("vo: " + vo);
		
		UserVO user = dao.getUser(vo);
		System.out.println("user: " + user);
		*/
		
		//스프링 프레임워크 사용================================================
		//1. 스프링컨테이너 구동
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. 스프링컨테이너에 생성된 객체 요청 및 사용
		UserService userService = (UserService) container.getBean("userService");
		
		//2-1. 입력
		UserVO uvo = new UserVO();
		uvo.setId("test");
		
		//목록 조회
		UserVO getuser = userService.getUser(uvo);
		System.out.println("ID값으로 조회 된 User : " + getuser);
		
		List<UserVO> ulist = userService.getUserList();
		
		for (UserVO list : ulist) {
			System.out.println("User Table List : " + list);
		}
		
		//3. 컨테이너 종료
		container.close();
	}
}
