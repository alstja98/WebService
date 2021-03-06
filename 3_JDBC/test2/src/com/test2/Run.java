package com.test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static common.JDBCTemplate.*;

public class Run {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1.전체출력");
			System.out.println("2.추가");
			
			System.out.print("메뉴선택 : ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				selectAll();
				break;
				
			case 2:
				insert();
				break;
			}
		}while(true);
		
	}
	
	public static void selectAll(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("[Error] 드라이버 등록 실패");
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/multi";
		String id = "root";
		String pw = "1234";
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url,id,pw);
			
		} catch (SQLException e) {
			System.out.println("[Error] 커넥션 연결 실패");
			e.printStackTrace();
		}
		
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Board> res = new ArrayList<Board>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(" SELECT * FROM BOARD ");
			int i = 0;
			
			while(rs.next()) {
				Board tmp = new Board(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),new Date());
	
				res.add(i,tmp);
				i += 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Close(rs);
			Close(stmt);
		}
		
		Iterator it = res.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}	
		
	}
	
	
	public static void insert() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("[Error] 드라이버 등록 실패");
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/multi";
		String id = "root";
		String pw = "1234";
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url,id,pw);
			
		} catch (SQLException e) {
			System.out.println("[Error] 커넥션 연결 실패");
			e.printStackTrace();
		}
		
		PreparedStatement pstm = null;
		int res = 0;
		long javaDate = new Date().getTime();
		java.sql.Date sqlDate = new java.sql.Date(javaDate);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("추가할 글번호를 입력하세요: ");
		int no = sc.nextInt();
		System.out.print("추가할 제목을 입력하세요: ");
		String title = sc.next();
		System.out.print("추가할 작성자 이름을 입력하세요");
		String writer = sc.next();
		System.out.print("추가할 내용을 입력하세요");
		String content = sc.next();
		
		Board b = new Board(no,title,writer,content,new Date());
		
		try {
			pstm = con.prepareStatement(" INSERT INTO BOARD VALUES(?,?,?,?,?); ");
			pstm.setInt(1, b.getNo());
			pstm.setString(2, b.getTitle());
			pstm.setString(3, b.getWriter());
			pstm.setString(4, b.getContent());
			pstm.setDate(5, sqlDate);
			
			res = pstm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Close(pstm);
		}
		
		if(res >0) {
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
		}
		
	}
	
}
