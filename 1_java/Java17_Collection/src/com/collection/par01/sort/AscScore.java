package com.collection.par01.sort;

import java.util.Comparator;

public class AscScore implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		//점수 오름차순
		int other1 = ((Score)o1).getScore();
		int other2 = ((Score)o2).getScore();
		
		if(other1 > other2) {
			return 1; //바꿔야 하면 양수 리턴
		}else {
			return -1; //바꾸지 않아도 되면 음수 리턴
		}
	
	}
	

}
