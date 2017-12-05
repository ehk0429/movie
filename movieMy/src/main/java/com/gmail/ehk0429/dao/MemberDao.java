package com.gmail.ehk0429.dao;

import com.gmail.ehk0429.domain.MemberVO;

public interface MemberDao {

		public String getTime();
		
		public void inserMember(MemberVO vo);
		
		public MemberVO readMember(String userid) throws Exception;
		
		public MemberVO readWithPw(String userid, String pw) throws Exception;
}
