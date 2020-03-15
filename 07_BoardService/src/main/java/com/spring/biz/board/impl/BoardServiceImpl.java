package com.spring.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.biz.board.BoardService;
import com.spring.biz.board.BoardVO;

//@Service : @Component 상속받아 만든
//비즈니스 로직 처리 서비스 영역에 사용
@Service("boardService")
public class BoardServiceImpl implements BoardService{
	@Autowired //타입이 일치하는 객체(인스턴스) 주입
	private BoardDAO boardDAO;
	
	public BoardServiceImpl() {
		System.out.println(">> BoardServiceImpl() 실행 됨");
	}
	
	@Override
	public void insertBoard(BoardVO bvo) {
		boardDAO.insertBoard(bvo);
	}

	@Override
	public void updateBoard(BoardVO bvo) {
		boardDAO.updateBoard(bvo);
	}

	@Override
	public void deleteBoard(BoardVO bvo) {
		boardDAO.deleteBoard(bvo);
	}

	@Override
	public BoardVO getBoard(BoardVO bvo) {
		return boardDAO.getBoard(bvo);
	}

	@Override
	public List<BoardVO> getBoardList() {
		return boardDAO.getBoardList();
	}

}
