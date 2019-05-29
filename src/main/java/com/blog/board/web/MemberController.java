package com.blog.board.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blog.board.domain.MemberVO;
import com.blog.board.service.MemberService;

@Controller
public class MemberController {

	@Resource(name="MemberService")
	private MemberService memberService;
	
	@RequestMapping(value="/selectLoginForm.do")
	public String insertBoardForm(Model model) 
	{
		System.out.println("***selectLoginForm***");
		return "member/login";		
	}
	
	@ResponseBody
	@RequestMapping(value="/selectLoginView.do")
	public MemberVO selectLoginView(Model model, @ModelAttribute("memberVO") MemberVO memberVO ) 
	{
		System.out.println("***selectLoginView***");
		System.out.println(memberVO.getMember_id());
		System.out.println(memberVO.getMember_password());
		memberVO = memberService.selectMemberInfo(memberVO);
		System.out.println("##############################");
		System.out.println(memberVO.getMember_id());
		System.out.println(memberVO.getMember_password());
		System.out.println(memberVO.getMember_name());
		System.out.println(memberVO.getMember_phone());
		System.out.println(memberVO.getMember_email());
		System.out.println("##############################");
		//model.addAttribute("memberVO", memberVO);
		return memberVO;
	}
	
}
