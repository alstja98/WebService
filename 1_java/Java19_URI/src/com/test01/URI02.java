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
		urlConn.connect();													//인터넷 연결
		
		DataInputStream di = new DataInputStream(urlConn.getInputStream()); //인터넷에서 가져올 보조스트림(기반스트림)
		
		FileOutputStream fs = new FileOutputStream("a.png"); //이미지를 보낼 기반스트림
		
		while(di.read(b,0,1) != -1 ) {
			fs.write(b,0,1);
		}
		System.out.println("완료!");
		di.close();
		fs.close();
		
		
		
	}

}
