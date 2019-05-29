package com.blog.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blog.board.dao.BoardDAO;
import com.blog.board.domain.BoardVO;
import com.blog.board.domain.MemberVO;

@Service("BoardService")
public class BoardServiceImpl implements BoardService {

	@Resource(name="BoardDAO")
	private BoardDAO boardDAO;
	
	public List<MemberVO> selectBoardList(BoardVO boardVO)
	{
		return this.boardDAO.selectBoardList(boardVO);
		//return null;
	}
}
