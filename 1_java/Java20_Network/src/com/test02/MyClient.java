package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

//서버 생성 후 클라이언트에서 서버로 데이터 보내는거 확인해보기
public class MyClient {
	public static void main(String[] args) throws IOException {
		//소켓
		DatagramSocket ds = new DatagramSocket();
		System.out.println("클라이언트");
		
		//보낼 data
		byte[] buff = "연습입니다. ".getBytes();
		
		//패킷 생성 (여기에 보낼 주소와 포트번호까지 넣어줌)
		DatagramPacket sendP = new DatagramPacket(buff, buff.length, InetAddress.getByName("localhost"), 9999);
		
		//보낸다.
		ds.send(sendP);
		
		ds.close();
		ds.disconnect();
		
		
	}
	
		
		
}
