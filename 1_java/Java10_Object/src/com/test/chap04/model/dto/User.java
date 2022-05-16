package com.test.chap04.model.dto;

import java.util.Date;

public class User {
	//필드
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;
	
	//생성자(기본생성자, 매개변수생성자)
	public User() {
		
	}
	
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public User(String userId, String userPwd, String userName, Date enrollDate) {
	/*	this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName; */
		this(userId, userPwd, userName); // 이것들은 위에 메소드에서 중복되어 초기화되는거니까 this()로 간편화가능
		
		this.enrollDate = enrollDate;//이 부분은 초기화되는적이 없었으니까 직접 해줘야함.
	}
	
	public 
	
	//getter&setter //getter는 값을 가져다가주는거 , setter는 받아 저장하는
	public String getUserId() {  //public 옆에 String은 결과를 return해줄때 반환값.
		return userId;
	}
	
	public String getuserPwd() {
		return userPwd;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public Date getEnrollDate() {
		return enrollDate;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserPwd(String userPwd) { //매개변수의 값을 필드에 저장
		this.userPwd = userPwd;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	//information()
	public void information() {
		System.out.println(userId + "," + userPwd + ", " + userName + ", " + enrollDate);
	}
	//toString()
	
	
	
}
