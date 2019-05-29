package com.blog.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blog.board.domain.BoardVO;
import com.blog.board.domain.MemberVO;

@Mapper
@Repository("BoardDAO")
public class BoardDAO {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public List<MemberVO> selectBoardList(BoardVO boardVO)
	{
		return sqlSessionTemplate.selectList("selectBoardList");
	}
	

	//public List<BoardVO> selectBoardList(BoardVO boardVO);
	/*
	{
		System.out.println("***selectBoardList-DAO***");
		//return selectList("BoardSql.selectBoardList");
		//Map<String,Object> paramMap = new HashMap<String,Object>();
		
		//Test
		//connection = getOracle();
		//Test
		
		return sqlSession.selectList("com.blog.board.dao.BoardMapper.selectBoardList", boardVO);
		//return null;
	}
	*/
	
}
