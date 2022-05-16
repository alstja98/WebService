package com.test01;

import static common.JDBCTemplate.Close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest04 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		insert();
		
		select();
		
	}

	//mysql출력내용을 여기서 출력할수있는 메소드
	public static void select() throws SQLException, ClassNotFoundException {
		//MYTEST 테이블로부터 데이터를 읽어 화면에 출력
		
		Connection con = null;
		Statement pstm = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM MYTEST ";
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/multi";
		String id = "root";
		String pw = "1234";
		
		Class.forName(driver);//
		con = DriverManager.getConnection(url, id, pw);
		pstm = con.prepareStatement(sql);
		rs = pstm.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getString(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
		}
		
		rs.close();
		pstm.close();
		con.close();
	}
	
	public static void insert () throws SQLException {
	//preparedStatement
		
		Connection con = null;
		PreparedStatement pstm = null;
		
		int no = 0;
		String name = null;
		String nickName = null;
		
		String sql = " INSERT INTO MYTEST VALUES(?, ?, ?) " ;
			
		Scanner sc = new Scanner(System.in);
		System.out.println("no: ");
		no = sc.nextInt();
		System.out.print("name: ");
		name = sc.next();
		System.out.print("nickName: ");
		nickName = sc.next();
		
		con = getConnection();
		pstm = con.prepareStatement(sql);
		pstm.setInt(1, no); //첫번째 물음표를 no로 채우자
		pstm.setString(2, name); //두번째 물음표를 name으로 채우자
		pstm.setString(3, nickName);
		
		int res = pstm.executeUpdate();
		
		if(res>0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		Close(pstm);
		Close(con);
		sc.close();
		
		try {
			select();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
