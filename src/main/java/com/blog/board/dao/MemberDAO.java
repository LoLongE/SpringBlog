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
	
	public MemberVO selectMemberInfo(MemberVO memberVO)
	{
		System.out.println("MEMBERDAO");
		System.out.println(memberVO.getMember_id());
		System.out.println(memberVO.getMember_password());
		return sqlSessionTemplate.selectOne("selectMemberInfo", memberVO);
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
