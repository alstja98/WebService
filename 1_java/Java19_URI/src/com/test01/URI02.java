package com.test01;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URI02 {

	public static void main(String[] args) throws IOException {
		byte[] b = new byte[1];
		
		URL url = new URL("https://blog.kakaocdn.net/dn/cZsyTw/btq0u5VBWge/F7xmauYA6r8nnbXSz2vJhK/img.png");
		
		URLConnection urlConn = url.openConnection();
		urlConn.connect();													//���ͳ� ����
		
		DataInputStream di = new DataInputStream(urlConn.getInputStream()); //���ͳݿ��� ������ ������Ʈ��(��ݽ�Ʈ��)
		
		FileOutputStream fs = new FileOutputStream("a.png"); //�̹����� ���� ��ݽ�Ʈ��
		
		while(di.read(b,0,1) != -1 ) {
			fs.write(b,0,1);
		}
		System.out.println("�Ϸ�!");
		di.close();
		fs.close();
		
		
		
	}

}
