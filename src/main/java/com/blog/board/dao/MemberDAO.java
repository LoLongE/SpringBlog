package com.blog.board.dao;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blog.board.domain.MemberVO;

@Mapper
@Repository("MemberDAO")
public class MemberDAO {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public MemberVO selectLoginView(MemberVO memberVO)
	{				
		return sqlSessionTemplate.selectOne("selectLoginView", memberVO);
	}
	public void selectLoginView_TEST()
	{			
		System.out.println("aaass");
		sqlSessionTemplate.selectOne("selectLoginView_TEST");
		
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
