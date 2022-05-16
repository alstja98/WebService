package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Driver 등록
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2. DBMS 연결
		String url = "jdbc:mysql://localhost/multi";
		String user = "root";
		String pw = "1234";
		
		Connection con = DriverManager.getConnection(url, user, pw);
		
		// 3. 쿼리 준비
		String sql = " SELECT * FROM EMPLOYEE ";  //쿼리문 준비시 세미콜론은 뺴고 쓴다.
		Statement stmt = con.createStatement();
		
		// 4. 쿼리 실행 및 결과 리턴
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) { //테이블의 컬럼 순서로 가져와도 되고 순서를 모르면 컬럼 이름으로 가져오면 된다.
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt("SALARY"));
		}
		
		// 5. DB 종료. 연결했던 역순으로 닫아야만 한다.
		rs.close();
		stmt.close();
		con.close();
		
		
		
	}

}
