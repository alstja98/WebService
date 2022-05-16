package com.model.service;

import java.sql.Connection;
import java.util.List;

import com.model.dto.Member;

public class MemberController {
	MemberBiz biz = new MemberBizImpl();
	
	public List<Member> selectAll() {
		List<Member> res = biz.selectAll();
		return res;
		
	}
	
	public Member selectOne(int no) {
		return biz.selectOne(no);
	}
	
	public int insert(Member m) {
		int res =  biz.insert(m);
		return res;
	}
	
	public int delete(int no) {
		return biz.delete(no);
	}
	
	public int update(Member m) {
		
		return biz.update(m);
	}
	
	
	

}
