package com.blog.board.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blog.board.dao.BoardDAO;
import com.blog.board.domain.BoardVO;

@Service("BoardService")
public class BoardServiceImpl implements BoardService {

	@Resource(name="BoardDAO")
	private BoardDAO boardDAO;
	
	public List<BoardVO> selectBoardList(BoardVO boardVO)
	{
		return this.boardDAO.selectBoardList(boardVO);
		//return null;
	}
	
	public List<Map<String,Object>> selectBoardTest01(Map<String,Object> paramMap)
	{
		return this.boardDAO.selectBoardTest01(paramMap);
	}
	
	public List<Map<String,Object>> selectBoardTest02(Map<String,Object> paramMap)
	{
		return this.boardDAO.selectBoardTest02(paramMap);
	}
}
