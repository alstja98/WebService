package com.test1;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		List<Board> bd = new ArrayList<Board>();
		
		bd.add(0, new Board(1,"안녕하세요","홍길동", new Date(),"처음 작성 하는 글입니다.", 1 ));
		bd.add(1, new Board(2,"반가워요","김유신", new Date(),"글은 처음으로 적어보네요.", 3 ));
		bd.add(2, new Board(2,"반가워요","김유신", new Date(),"글은 처음으로 적어보네요.", 3 ));
		bd.add(3, new Board(4,"무슨일이죠?","유관순", new Date(),"접속이 잘 안되네요ㅠ", 14 ));
		bd.add(4, new Board(5,"물어볼게 있습니다.","신사임당", new Date(),"탈퇴는 어떻게 하는건가요?", 9 ));
		
		Iterator it = bd.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}	
	}

}
