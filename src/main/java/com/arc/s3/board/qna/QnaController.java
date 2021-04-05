package com.arc.s3.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.arc.s3.board.BoardDTO;
import com.arc.s3.util.Pager;

@Controller
@RequestMapping("/qna/**")
public class QnaController {

	@Autowired
	private QnaService qnaService;
	
	@GetMapping("qnaList")
	public String getList(Pager pager,Model model) throws Exception{
		
		
		List<BoardDTO> ar = qnaService.getList(pager);
		model.addAttribute("list",ar);
		model.addAttribute("board","qna");
		
		return "board/boardList";
	}
	
	
	@GetMapping("qnaInsert")
	public ModelAndView setInsert()throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.addObject("board", "qna");
		mv.setViewName("board/boardInsert");
	
		return mv;
	}
	
	
	@PostMapping("qnaInsert")
	public ModelAndView setInsert(BoardDTO boardDTO)throws Exception{
		
		ModelAndView mv = new ModelAndView();
		int result = qnaService.setInsert(boardDTO);
		
		mv.setViewName("redirect:./qnaList");
		
		return mv;
	}
	
	@GetMapping("qnaSelect")
	public ModelAndView getSelect(BoardDTO boardDTO) throws Exception{
		boardDTO =	qnaService.getSelect(boardDTO);
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("board","qna");
		mv.addObject("dto",boardDTO);
		mv.setViewName("board/boardSelect");
		
		
		return mv;
		
	}
	
	@GetMapping("qnaReply")
	public String setReply (Model model) throws Exception{
		
		model.addAttribute("board","qna");
	
		
		return "board/boardReply";
	}
	
	
	@PostMapping("qnaReply")
	public String setReply(QnaDTO qnaDTO) throws Exception{
		
		qnaService.setReply(qnaDTO);
		
		return "redirect:./qnaList";
	}
}
