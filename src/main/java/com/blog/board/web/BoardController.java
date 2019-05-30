package com.blog.board.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		//model.addAttribute("test","jsp test");
		List<BoardVO> result = boardService.selectBoardList(boardVO);		
		System.out.println(result);
		System.out.println("empty : " + result.isEmpty());
		System.out.println("size : " + result.size());
		System.out.println("get0 : " + result.get(0));
		System.out.println("get1 : " + result.get(1));
		System.out.println("get2 : " + result.get(2));
		

		Map<String,Object> paramMap = new HashMap<String,Object>();
		List<Map<String,Object>> listMap01 = boardService.selectBoardTest01(paramMap);
		
		List<Map<String,Object>> listMap02 = boardService.selectBoardTest02(paramMap);
		System.out.println(listMap02);
		System.out.println(listMap02.get(0).get("rn"));
		System.out.println(listMap02.get(0).get("BoardVO"));
		
		
		
		
		return "board/boardList";
	}
	
	@RequestMapping(value="/insertBoardForm.do")
	public String insertBoardForm(Model model) 
	{
		System.out.println("***insertBoardForm***");
		return "board/boardWrite";		
	}
}
