package com.io.part03_add.byteToChar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ChangeStreamTest {
	public void input() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //buffered�� ���ڴ��� system.in�� ����Ʈ ����
																				 //inputStreamReader�� ��������.
		try {
			System.out.print("���ڿ� �Է�: ");
			String val = br.readLine();
			
			System.out.println("val : " + val);
		} catch (IOException e) {
			e.printStackTrace();
		} finally { 
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void output() {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			bw.write("java good!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
