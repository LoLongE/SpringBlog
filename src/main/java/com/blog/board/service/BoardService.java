package com.blog.board.service;

import java.util.List;

import com.blog.board.domain.BoardVO;
import com.blog.board.domain.MemberVO;

public interface BoardService {
	
	public List<MemberVO> selectBoardList(BoardVO boardVO);
	
}
