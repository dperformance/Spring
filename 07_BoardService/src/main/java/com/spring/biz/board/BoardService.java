package com.spring.biz.board;

import java.util.List;

public interface BoardService {
	//CRUD 기능 수현 메소드 정의
	void insertBoard(BoardVO bvo); //등록
	void updateBoard(BoardVO bvo); //수정
	void deleteBoard(BoardVO bvo); //삭제
	BoardVO getBoard(BoardVO bvo); //상세조회
	List<BoardVO> getBoardList();  //목록검색
}
