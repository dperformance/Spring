package com.spring.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.biz.board.BoardService;
import com.spring.biz.board.BoardVO;
import com.spring.biz.common.Log4jAdvice;
import com.spring.biz.common.LogAdvice;

//@Service : @Component 상속받아 만든
//비즈니스 로직 처리 서비스 영역에 사용
@Service("boardService")
public class BoardServiceImpl implements BoardService{
	@Autowired //타입이 일치하는 객체(인스턴스) 주입
	private BoardDAO boardDAO;
	
	//private LogAdvice log;
	private Log4jAdvice log4j;
	
	public BoardServiceImpl() {
		System.out.println(">> BoardServiceImpl() 실행 됨");
		//log = new LogAdvice();
		log4j = new Log4jAdvice();
	}
	
	@Override
	public void insertBoard(BoardVO bvo) {
		//log.rintLog();
		log4j.printLogging();
		boardDAO.insertBoard(bvo);
	}

	@Override
	public void updateBoard(BoardVO bvo) {
		//log.rintLog();
		log4j.printLogging();
		boardDAO.updateBoard(bvo);
	}

	@Override
	public void deleteBoard(BoardVO bvo) {
		//log.rintLog();
		log4j.printLogging();
		boardDAO.deleteBoard(bvo);
	}

	@Override
	public BoardVO getBoard(BoardVO bvo) {
		//log.rintLog();
		log4j.printLogging();
		return boardDAO.getBoard(bvo);
	}

	@Override
	public List<BoardVO> getBoardList() {
		//log.rintLog();
		log4j.printLogging();
		return boardDAO.getBoardList();
	}

}
