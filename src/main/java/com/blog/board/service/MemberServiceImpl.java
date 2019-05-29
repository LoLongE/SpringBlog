package com.blog.board.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blog.board.dao.MemberDAO;
import com.blog.board.domain.MemberVO;

@Service("MemberService")
public class MemberServiceImpl implements MemberService {

	@Resource(name="MemberDAO")
	private MemberDAO memberDAO;
	
	public MemberVO selectMemberInfo(MemberVO memberVO)
	{
		return this.memberDAO.selectMemberInfo(memberVO);
	}
}
