package com.spring.biz.board;

import java.util.List;

import com.spring.biz.board.impl.BoardDAO;

public class BoardTest {

	public static void main(String[] args) {
		BoardVO bvo = new BoardVO();
		BoardDAO bdao = new BoardDAO();
		
		System.out.println("글 입력 Inset");
		bvo.setTitle("hello");
		bvo.setWriter("코돌쓰");
		bvo.setContent("어휴 이게 뭐하는 짓이냐");
		bdao.insertBoard(bvo);
		
		bvo.setSeq(2);
		bvo = bdao.getBoard(bvo);
		System.out.println("글 하나 조회 : " + bvo);
		
		System.out.println("");
		
		List<BoardVO> list = bdao.getBoardList();
		System.out.println("전체글 조회 : " + list.toString());
	}

}
