package com.io.part02_char;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamTest {
	public void fileSave() {
		// new 보조스트림(다른 스트림);
		// new 보조스트림(new 기반스트림(외부자원));
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("sample2.txt");
			
			fw.write("우리나라 대한민국");
			fw.write('A');
			char[] car = {'a','p','p','l','e'};
			fw.write(car);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
				System.out.println("저장완료");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileOpen() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("sample2.txt");
			
			int val = 0;
			while( (val=fr.read()) != -1) {
				System.out.print((char)val);
			}
			
			for(int i=0; i<50; i++) {
				System.out.println(fr.read());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
