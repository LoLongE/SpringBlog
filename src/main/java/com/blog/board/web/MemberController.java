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
	public String selectLoginForm(Model model) 
	{		
		return "member/login";		
	}
	
	@ResponseBody
	@RequestMapping(value="/selectLoginView.do")
	public String selectLoginView(Model model, @ModelAttribute("memberVO") MemberVO memberVO ) 
	{
		memberVO = memberService.selectLoginView(memberVO);		
		return "redirect:/testBoardList.do";
	}
	
}
