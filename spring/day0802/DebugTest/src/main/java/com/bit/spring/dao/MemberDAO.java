package com.bit.spring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bit.spring.vo.Member;

//	oracle DB와 connection
//	stream 부여받고
//	crud 명령 처리하고 결과 리턴
public class MemberDAO {
	
	private Connection connection;
//	oracle DB와 connection
//	stream 부여받고
	public void connection() {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			String user = "scott";
			String password = "tiger";
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("connection ok");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
//	crud 명령 처리하고 결과 리턴
	//	select : id, pw 존재여부 체크. 존재하면 member instance 리턴
	public Member loginCheck(String userId, String userPw) {
		Member member = null;
		String sql = "select email, age, userName from member where userId=? and userPw=?";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, userPw);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				//레코드 단위로 있는 걸 하나씩 포인트가 옮겨가며 가져옴
				member = new Member();
				member.setUserId(userId);
				member.setUserPw(userPw);
				member.setEmail(resultSet.getString(1)); //email
				member.setAge(resultSet.getInt("age"));	 //age
				member.setUserName(resultSet.getString(3));//userName
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return member;
	}
	
//	연 스트림과 커넥션 종료
}
