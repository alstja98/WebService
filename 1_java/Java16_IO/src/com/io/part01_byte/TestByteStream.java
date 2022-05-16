package com.io.part01_byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {
	public void fileSave() {
		FileOutputStream fout = null;
		
		try {
			fout = new FileOutputStream("sample.txt"); //기반스트림(외부자원)
			
			fout.write(97);
			byte[] bar = {98, 99, 100, 101, 102, 103};
			fout.write(bar);
			fout.write(bar,1,3);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

	public void fileOpen() {
		FileInputStream fin = null; //stream 생성
		
		try {
			fin = new FileInputStream("sample.txt"); //외부파일 연결
			
		/*	int fileSize = (int)new File("sample.txt").length();
			byte[] bar = new byte[fileSize];
			fin.read(bar);	//파일 읽기
			
			for(int i=0; i<bar.length; i++) {
				System.out.print((char)bar[i] + " ");
			}		*/
			
			int val =0;
			while((val=fin.read()) != -1) {
				System.out.print((char)val + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();	//다하고 스트림 닫아줌
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	//try with resource 방법 - 이렇게 하면 close는 안써도 자동으로 된다.
	public void fileOpen2() {
		try (FileInputStream fin = new FileInputStream("sample.txt")){
			int size = (int)new File("sample.txt").length();
			byte[] bar =new byte[size];
			
			fin.read(bar);
			
			for(int i=0; i<bar.length; i++) {
				System.out.print(bar[i] + " " );
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
