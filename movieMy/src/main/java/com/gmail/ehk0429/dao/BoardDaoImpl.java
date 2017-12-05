package com.gmail.ehk0429.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gmail.ehk0429.domain.BoardVO;

@Repository
public class BoardDaoImpl implements BoardDao {

	
	@Autowired
	private SqlSession sqlSession;
	
	private static String namespace = "com.gmail.ehk0429.mappers.boardMapper";
	@Override
	public void create(BoardVO vo) throws Exception {
		sqlSession.insert(namespace+".create",vo);
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		
		return sqlSession.selectOne(namespace+".read", bno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		
		sqlSession.update(namespace+".update");
	}

	@Override
	public void delete(Integer bno) throws Exception {
		sqlSession.delete(namespace+".delete", bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return sqlSession.selectList(namespace+".listAll");
	}

}
