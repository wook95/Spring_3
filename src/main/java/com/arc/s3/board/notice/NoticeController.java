package com.arc.s3.board.notice;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.arc.s3.board.BoardDTO;
import com.arc.s3.util.Pager;

@Controller
@RequestMapping(value = "/notice/**")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	
	
	
	@RequestMapping(value = "noticeUpdate")
	public String setUpdate() throws Exception{
		System.out.print("11");
		return "board/boardUpdate";
		
	}
	
	
	
	@RequestMapping(value = "noticeUpdate", method=RequestMethod.POST)
	public String setUpdate(BoardDTO boardDTO) throws Exception{
		System.out.print(boardDTO);
		int result = noticeService.setUpdate(boardDTO);
		System.out.println(result); 
		
		
		return "redirect:../";
		
	}
	
	
	
	
	
	
	@RequestMapping(value = "noticeDelete")
	public String setDelete(BoardDTO boardDTO) throws Exception{
		
		int result = noticeService.setDelete(boardDTO);
		return "notice/accountList";
		
	}
	
	
	
	
	
	@RequestMapping(value = "noticeSelect")
	public String getSelect(BoardDTO boardDTO,Model model) throws Exception{
		
		
		boardDTO = noticeService.getSelect(boardDTO);
		model.addAttribute("dto",boardDTO);
		model.addAttribute("board","notice");
		return "board/boardSelect";
	}
	
	
	
	
	
	@RequestMapping(value = "noticeList")
	public ModelAndView getList (Pager pager) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		
		
//		System.out.println(pager.getCurPage());
		List<BoardDTO> ar = noticeService.getList(pager);
//		System.out.println(pager.getTotalPage());
		
		
		mv.addObject("list", ar);
		mv.addObject("board","notice");
		mv.setViewName("board/boardList");
		mv.addObject("pager",pager);

		return mv;
		
	}
	
	
	
	
	
	@RequestMapping(value = "noticeInsert")
	public ModelAndView setInsert() throws Exception{
		ModelAndView mv =new ModelAndView();
				
		mv.setViewName("board/boardInsert");
		mv.addObject("board","notice");
		return mv;		
				
	}

	@RequestMapping(value = "noticeInsert", method=RequestMethod.POST)
	public String setInsert(NoticeDTO noticeDTO,Model model) throws Exception{
		
		int result = noticeService.setInsert(noticeDTO);

		String message = "글쓰기 실패 ,,";
		
		if(result>0) {
			message = "공지글 올리기 성공~,~";
		}
		String path = "../notice/noticeList";		
		
		model.addAttribute("msg",message);
		model.addAttribute("result",result);
		model.addAttribute("path",path);
		
		return "common/commonResult";
	}
		
	
	
}
