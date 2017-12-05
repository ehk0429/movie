package com.gmail.ehk0429;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gmail.ehk0429.dao.MemberDao;
import com.gmail.ehk0429.domain.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDaoTest {

	 @Autowired
	 private MemberDao dao;
	 
	 @Test
	 public void testTime()throws Exception{
		 System.out.println(dao.getTime());
	 }
	 
	 @Test
	 public void testInsertMember()throws Exception{
		 MemberVO vo = new MemberVO();
		 vo.setUserid("user00");
		 vo.setUserpw("user00");
		 vo.setUsername("user00");
		 vo.setEmail("user00@aaa.com");
		 
		 dao.inserMember(vo);
	 }
}
