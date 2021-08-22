package Model;

import java.sql.*;

public class MyPageDAOImpl implements MyPageDAO{

		private Connection conn;
		private Statement st;
		private ResultSet rs;
		//DB 연결
		public void ConnDB() {
			try {
				if(conn == null) {
					
					final String driver = "Oracle.jdbc.driver.OracleDriver";
					final String url    = "jdbc:oracle:thin:@localhost:1521/xe";
					final String sqlid  = "SCOTT";
					final String sqlpw  = "tiger";
					
					Class.forName(driver);
					System.out.println("JDBC 드라이버 로드 성공");
					conn = DriverManager.getConnection(url, sqlid, sqlpw);
					System.out.println("Connection 객체 생성 성공");
					st = conn.createStatement();
					System.out.println("Statement 객체 생성 성공");
				}
			} catch(Exception e) {
				e.getMessage();
			}
		}


	@Override
	public void signUpMember(MyPageVO mb) {
		// TODO 회원 가입
		String ID = mb.getID();
		String PW = mb.getPW();
		String name = mb.getName();
		String birth = mb.getBirth();

		try {
			
		ConnDB();
		
		String sql = "INSERT INTO MEMBER(ID, PW, NAME, BIRTH) VALUES(?, ?, ?, ?)";
		System.out.println(sql);
		
		PreparedStatement st = conn.prepareStatement(sql);
		
		st.setString(1, ID);
		st.setString(2, PW);
		st.setString(3, name);
		st.setString(4, birth);

		st.executeUpdate(sql);
		
		closeDB();
//		st.close();
//		rs.close();
//		conn.close();
		
		} catch (Exception e) {
			System.out.println("회원가입 실패!실패!실패!" +e.getMessage());
			
		}	
	}

	@Override
	public void viewMember(MyPageVO mb) {
		// TODO 내 정보 조회
		String PW = mb.getPW();
		String ID = mb.getID();

		try {
			
		ConnDB();
		
//		String sql = "SELECT ID, NAME, BIRTH FROM MEMBER WHERE ID = ?";
//		System.out.println(sql);
		
		PreparedStatement st = conn.prepareStatement("SELECT ID, NAME, BIRTH FROM MEMBER WHERE ID = ?");
		
		st.setString(1, ID);
		ResultSet rs = st.executeQuery();
		
		closeDB();
		
		} catch (Exception e) {
			e.getMessage();
		}	
		
	}

	@Override
	public void modifyMember(MyPageVO mb) {
		// TODO 정보 수정

		String PW = mb.getPW();
		String name = mb.getName();
		String birth = mb.getBirth();
		String ID = mb.getID();

		try {
			
		ConnDB();
		
//		String sql = "UPDATE MEMBER SET PW, NAME, BIRTH WHERE ID = ?";
//		System.out.println(sql);
		
		PreparedStatement st = conn.prepareStatement("UPDATE MEMBER SET PW = ?, NAME = ?, BIRTH = ? WHERE ID = ?");
												//뭐를 업데이트 해야하는지?
		st.setString(1, PW);
		st.setString(2, name);
		st.setString(3, birth);
		st.setString(4, ID);
		
		st.executeUpdate();
		
		closeDB();
		
		} catch (Exception e) {
			e.getMessage();
		}	
	}

	@Override
	public void deleteMember(MyPageVO mb) {
		// TODO 회원 탈퇴
		String PW = mb.getPW();
		String ID = mb.getID();

		try {
			
		ConnDB();
		
		String sql = "DELETE FROM MEMBER WHERE ID = ?";
		System.out.println(sql);
		
		PreparedStatement st = conn.prepareStatement(sql);
		
		st.setString(1, ID);
		
		st.executeUpdate();
		
		closeDB();
		
		} catch (Exception e) {
			e.getMessage();
		}	
		
	}

	//DB 종료
	public void closeDB() {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		conn = null;
	}
	
	public static void main(String[] args) {
		
	}

}
