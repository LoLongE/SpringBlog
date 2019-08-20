package com.blog.board.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.NumberUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.blog.board.domain.BoardVO;
import com.blog.board.domain.MemberVO;
import com.blog.board.domain.PagingVO;
import com.blog.board.service.BoardService;

@Controller
public class BoardController {

	@Resource(name="BoardService")
	private BoardService boardService;
	
	@RequestMapping(value="/selectBoardList.do")
	public String selectBoardList(Model model,
			@ModelAttribute("boardVO") BoardVO boardVO,
			@ModelAttribute("memberVO") MemberVO memberVO,
			@RequestParam(value="totalCount", defaultValue="0") int totalCount,
			@RequestParam(value="pageNo", defaultValue="1") int pageNo) 
	{
		Map<String,Object> paramMap = new HashMap<String,Object>();		
		PagingVO pagingVO = new PagingVO(totalCount, pageNo, 10, 10);
		paramMap.put("pagingVO", pagingVO);
		List<Map<String,Object>> result = boardService.selectBoardTest02(paramMap);		
		pagingVO.setTotalCount((int)result.get(0).get("totalCount"));
		model.addAttribute("result",result);
		model.addAttribute("pagingVO",pagingVO);
		return "board/boardList";
	}
	
	@RequestMapping(value="/insertBoardForm.do")
	public String insertBoardForm(Model model) 
	{
		System.out.println("***insertBoardForm***");
		return "board/boardWrite";		
	}
	
}
