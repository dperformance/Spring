package com.spring.biz.board;

import java.util.List;

public interface BoardService {
	//CRUD 기능 수현 메소드 정의
	void insertBoard(BoardVO bvo);
	void updateBoard(BoardVO bvo);
	void deleteBoard(BoardVO bvo);
	BoardVO getBoard(BoardVO bvo);
	List<BoardVO> getBoardList();
}
