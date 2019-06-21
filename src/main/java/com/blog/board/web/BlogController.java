package com.blog.board.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.board.domain.MemberVO;
import com.blog.board.service.MemberService;

@Controller
public class BlogController {

	@Resource(name="MemberService")
	private MemberService memberService;
	
	@RequestMapping(value="/selectBlogLoginForm.do")
	public String selectBlogLoginForm(Model model) 
	{		
		return "blog/blogLogin";		
	}
	
	@RequestMapping(value="/selectBlogLoginView.do")
	public String selectBlogLoginView(Model model,
			@ModelAttribute("memberVO") MemberVO memberVO) 
	{		
		memberVO = memberService.selectLoginView(memberVO);
		try {
			if(memberVO.getMember_id() == null || memberVO.getMember_id() == ""){
				return "blog/blogLogin";
			} else {
				model.addAttribute("memberVO", memberVO);
				return "blog/blogList";
			}
		} catch (Exception e) {
			return "blog/blogLogin";
		}		
	}
	
	@RequestMapping(value="/selectBlogList.do")
	public String selectBlogList(Model model,
			@ModelAttribute("memberVO") MemberVO memberVO) 
	{		
		return "blog/blogList";		
	}
	
	@RequestMapping(value="/selectBlogMain.do")
	public String selectBlogMain(Model model,
			@ModelAttribute("memberVO") MemberVO memberVO) 
	{		
		return "blog/blogMain";		
	}

}
