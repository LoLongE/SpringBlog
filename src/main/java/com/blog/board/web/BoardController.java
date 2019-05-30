package com.blog.board.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.board.domain.BoardVO;
import com.blog.board.domain.MemberVO;
import com.blog.board.service.BoardService;

@Controller
public class BoardController {

	@Resource(name="BoardService")
	private BoardService boardService;
	
	@RequestMapping(value="/selectBoardList.do")
	public String selectBoardList(Model model,
			@ModelAttribute("boardVO") BoardVO boardVO,
			@ModelAttribute("memberVO") MemberVO memberVO ) 
	{
		//model.addAttribute("BoardVO", boardVO);
		model.addAttribute("test","jsp test");
		List<MemberVO> result = boardService.selectBoardList(boardVO);		
		return "board/boardList";
	}
	
	@RequestMapping(value="/insertBoardForm.do")
	public String insertBoardForm(Model model) 
	{
		System.out.println("***insertBoardForm***");
		return "board/boardWrite";		
	}
}
