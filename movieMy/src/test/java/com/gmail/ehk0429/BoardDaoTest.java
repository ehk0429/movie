package com.gmail.ehk0429;

import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.gmail.ehk0429.dao.BoardDao;
import com.gmail.ehk0429.domain.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardDaoTest {
	
	@Inject
	private BoardDao dao;
	
			
	@Test
	public void testCreate()throws Exception{
		BoardVO board = new BoardVO();
		board.setTitle("새로운글");
		board.setContent("새로운 글");
		board.setWriter("user00");
		dao.create(board);
	}
	
	
}
