package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		Socket clientSocket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		
		BufferedReader stdIn = null;
		
		System.out.println("server에 접속합니다.");
		
		try {
			clientSocket = new Socket("localhost",8888);
			
			out = new PrintWriter(clientSocket.getOutputStream(),true);  //서버 통신용 스트림
			
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // 서버 통신용 스트림
			
			stdIn = new BufferedReader(new InputStreamReader(System.in));  //콘솔로 입력받기위한 스트림
			
			String inputLine = null;
			while((inputLine = stdIn.readLine()) != null) {
				out.println(inputLine);
				System.out.println("server로부터 다시 받은 메시지: " + in.readLine());
			}
			
			stdIn.close();
			in.close();
			out.close();
			clientSocket.close();
			
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
