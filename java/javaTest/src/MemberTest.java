

import java.sql.*;

public class MemberTest{	
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url  = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static final String user = "scott";
	private static final String pwd = "tiger";

	public static void main(String []args)
	{
		Connection conn;
		Statement stmt;
		ResultSet  rs;
		try{
			Class.forName(driver);
			System.out.println("Oracle 드라이버 로딩 성공");
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection 생성 성공");
			stmt = conn.createStatement();
			System.out.println("Statement 생성 성공");
			
//			<statement로 쓸 때>
//			String query = "INSERT INTO Member01 VALUES ( '0003','차범근' , 185, 85 , 23 )";
//			String query = "INSERT INTO Member01 VALUES ( '" +0003+ "','" +차범근+ "' , " +185+ ", " +85+ " , " +23+ " )";
			//값대신 변수가 들어갈 때는 잘라서 문자열 연산
//			System.out.println( query) ;
//			stmt.executeUpdate( query );
			
			//<PreparedStatement로 쓸 때>
			String query = "INSERT INTO Member01 VALUES ( ?, ?, ?, ?, ? )";
			PreparedStatement pstmt = conn.prepareStatement(query);
			System.out.println("PreparedStatement 생성 성공");
			pstmt.setString(1, "0004");
			pstmt.setString(2, "박지성");
			pstmt.setInt(3, 178);
			pstmt.setInt(4, 67);
			pstmt.setInt(5, 23);
			pstmt.executeUpdate();
			
			pstmt.setString(1, "0005");
			pstmt.setString(2, "임꺽정");
			pstmt.setInt(3, 167);
			pstmt.setInt(4, 45);
			pstmt.setInt(5, 18);
			pstmt.executeUpdate();
			

			String query2 = "SELECT * FROM Member01" ;
			System.out.println( query2) ;
			rs = stmt.executeQuery( query2);
			while(rs.next()){//resultset에 레코드가 있는 동안 반복
			    System.out.print( "아이디는>>" +  rs.getString( "id" ) ); 
				System.out.print( ", 이름은>>" +  rs.getString( "name" ) );
				System.out.print( ", 키는>>" +  rs.getInt( "height" ) );
				System.out.print( ", 체중은>>" +  rs.getInt( "weight" ) );
				System.out.print( ", 나이는>>" +  rs.getInt( "age" ) );
				System.out.println();
			   }
            rs.close();
			stmt.close();
			conn.close();
      }catch(ClassNotFoundException e){
			e.printStackTrace();
      }catch(SQLException e){
			e.printStackTrace();
	  }
   }
}
