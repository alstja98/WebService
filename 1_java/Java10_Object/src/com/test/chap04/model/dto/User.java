package com.test.chap04.model.dto;

import java.util.Date;

public class User {
	//�ʵ�
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;
	
	//������(�⺻������, �Ű�����������)
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
		this(userId, userPwd, userName); // �̰͵��� ���� �޼ҵ忡�� �ߺ��Ǿ� �ʱ�ȭ�Ǵ°Ŵϱ� this()�� ����ȭ����
		
		this.enrollDate = enrollDate;//�� �κ��� �ʱ�ȭ�Ǵ����� �������ϱ� ���� �������.
	}
	
	public 
	
	//getter&setter //getter�� ���� �����ٰ��ִ°� , setter�� �޾� �����ϴ�
	public String getUserId() {  //public ���� String�� ����� return���ٶ� ��ȯ��.
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
	
	public void setUserPwd(String userPwd) { //�Ű������� ���� �ʵ忡 ����
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
