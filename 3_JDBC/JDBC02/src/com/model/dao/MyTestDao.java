package com.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.dto.MyTest;
import static common.JDBCTemplate.*;

public class MyTestDao {
	private Connection con;
	
	public MyTestDao(Connection con) {
		super();
		this.con = con;
	}

	//select
	public List<MyTest> getAll() {
		Statement stmt = null;
		ResultSet rs = null;
		List<MyTest> my = new ArrayList<MyTest>();
		String sql = " SELECT * FROM MYTEST " ;
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MyTest tmp = new MyTest(rs.getInt(1), rs.getString(2), rs.getString(3));
				my.add(tmp);
			}
		} catch (SQLException e) {
			System.out.println("[ERROR] select 에러");
			e.printStackTrace();
		}
		
	
		return my;
		
	}
	
	//insert
	public int insert(MyTest input) {
		PreparedStatement pstm = null;
		int res = 0;
		
		String sql = " INSERT INTO MYTEST VALUES(?,?,?) ";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1,  input.getMno());
			pstm.setString(2, input.getMname());
			pstm.setString(3, input.getNickname());
			
			res = pstm.executeUpdate();
			if(res>0) {
				System.out.println("insert 성공");
				Commit(con);
			}else {
				System.out.println("insert 실패");
				Rollback(con);
				
			}
			
		} catch (SQLException e) {
			System.out.println("[ERROR] insert");
			e.printStackTrace();
		}
		
		
		return res;
	}


	public int update( MyTest input) {
		//UPDATE MYTEST SET MNAME=?, NICKNAME=? WHERE MNO=?
		PreparedStatement pstm = null;
		int res = 0;
		
		String sql = " UPDATE MYTEST SET MNAME=?, NICKNAME=? WHERE MNO=? ";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1,  input.getMname());
			pstm.setString(2, input.getNickname());
			pstm.setInt(3, input.getMno());
			
			res = pstm.executeUpdate();
			if(res>0) {
				System.out.println("UPDATE 성공");
				Commit(con);
			}else {
				System.out.println("UPDATE 실패");
				Rollback(con);
			}
			
		} catch (SQLException e) {
			System.out.println("[ERROR] insert");
			e.printStackTrace();
		}
		
		return res;
	}
	
	public int delete(int no) {
		//DELETE FROM MYTEST WHERE MNO=?
		PreparedStatement pstm = null;
		int res = 0;
		
		String sql = "DELETE FROM MYTEST WHERE MNO=?";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, no);
			
			res = pstm.executeUpdate();
			if(res>0) {
				System.out.println("DELETE 성공");
				Commit(con);
			}else {
				System.out.println("DELETE 실패");
				Rollback(con);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
		
	} 
	 
	public MyTest selectOne(int no) {
		//select * from myTest where mno = ?
		PreparedStatement pstm = null;
		ResultSet rs = null;
		// MyTest my = new MyTest();
		MyTest res = null;
		
		String sql = "SELECT * FROM MYTEST " + " WHERE MNO=? ";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1,no);
			
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				res = new MyTest(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
}
	
