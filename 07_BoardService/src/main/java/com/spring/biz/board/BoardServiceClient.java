package com.spring.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String[] args) {
		//1. 스프링컨테이너 구동
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		
		//2. 스프링컨테이너에 생성된 객체 요청 및 사용
		System.out.println("\n컨테이너 구동후");
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		//2-1. 입력
		BoardVO bvo = new BoardVO();
		bvo.setTitle("도올쓰");
		bvo.setWriter("코돌");
		bvo.setContent("이제 얼마 남지 않았습니다.");
		
		//전체목록 조회
		System.out.println("=================================");
		System.out.println("");
		List<BoardVO> list = boardService.getBoardList();
		System.out.println("가져온 list 수 : " + list.size());
		
		
		for (BoardVO board : list) {
			System.out.println("board select data : " + board);
		}
		
		//boardService.insertBoard(bvo);
		
		
		//3. 컨테이너 종료(close)
		container.close();
	}

}
