package com.gmail.ehk0429.dao;

import java.util.List;

import com.gmail.ehk0429.domain.BoardVO;

public interface BoardDao {

	public void create(BoardVO vo) throws Exception;

	public BoardVO read(Integer bno) throws Exception;

	public void update(BoardVO vo) throws Exception;

	public void delete(Integer bno) throws Exception;

	public List<BoardVO> listAll() throws Exception;
}
