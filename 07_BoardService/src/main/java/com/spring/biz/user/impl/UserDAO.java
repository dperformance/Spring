package com.spring.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.biz.board.BoardVO;
import com.spring.biz.common.JDBCUtil;
import com.spring.biz.user.UserVO;
@Repository("userDAO")
public class UserDAO {

	//JDBC 관련 변수(필드)
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//SQL문
	private final String USER_GET = "SELECT * FROM USERS WHERE ID = ?";
	private final String USER_LIST = "SELECT * FROM USERS ORDER BY ID ";
	
	//SQL Method
	public UserVO getUser(UserVO uvo) {
		System.out.println("getUser method 실행");
		UserVO uservo = null;
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(USER_GET);
			pstmt.setString(1, uvo.getId());
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				uservo = new UserVO();
				uservo.setId(rs.getString("ID"));
				uservo.setPassword(rs.getString("PASSWORD"));
				uservo.setName(rs.getString("NAME"));
				uservo.setRole(rs.getString("ROLE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
			System.out.println("getUser method 완료");
		}
		
		return uservo;
	} //getUser END
	
	public List<UserVO> getUserList() {
		List<UserVO> userList = new ArrayList<>();
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(USER_LIST);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				userList.add(new UserVO(rs.getString("ID"),
										rs.getString("PASSWORD"),
										rs.getString("NAME"),
										rs.getString("ROLE")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return userList;
	}
}
