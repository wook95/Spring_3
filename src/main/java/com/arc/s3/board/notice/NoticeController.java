package com.arc.s3.board.notice;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.arc.s3.board.BoardDTO;
import com.arc.s3.board.BoardFileDTO;
import com.arc.s3.util.Pager;
import com.arc.s3.util.Pager_backup;

@Controller
@RequestMapping(value = "/notice/**")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	
	
	@GetMapping("fileDelete")
	public ModelAndView setFileDelete(BoardFileDTO boardFileDTO) throws Exception{
		
		ModelAndView mv= new ModelAndView();
		int result = noticeService.setFileDelete(boardFileDTO);
		mv.addObject("result",result);
		mv.setViewName("common/ajaxResult");
		return mv;
	}
	
	
	
	@PostMapping("noticeUpdate")
	public ModelAndView setUpdate(BoardDTO boardDTO,ModelAndView mv,MultipartFile[] files) throws Exception {
		
		int result = noticeService.setUpdate(boardDTO,files);
		
		if(result>0) {
			mv.setViewName("redirect:./noticeList");
		}else {
			mv.addObject("msg", "수정 실패");
			mv.addObject("path","./noticeList");
			mv.setViewName("common/commonResult");
		}
		
		return mv;
	}
	
	
	
	
	
	@GetMapping("noticeUpdate")
	public ModelAndView setUpdate(BoardDTO boardDTO) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		boardDTO = noticeService.getSelect(boardDTO);
		
		mv.addObject("dto", boardDTO);
		mv.addObject("board", "notice");
		mv.setViewName("board/boardUpdate");
		
		return mv;
		
	}
	
	
	
	
	
	

	
	
	@PostMapping("noticeDelete")
	public ModelAndView setDelete(BoardDTO boardDTO) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		int result = noticeService.setDelete(boardDTO);
		
		String message = "삭제 실패";
		String path = "./noticeList";
		
		if(result>0) {
			message = "삭제 ,, 성공 ,,";
			
		}
		mv.addObject("path", path);
		mv.addObject("msg", message);
		mv.setViewName("common/commonResult");
		
		return mv;
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
	public String setInsert(BoardDTO noticeDTO,Model model,MultipartFile[] files) throws Exception{
		//													files라는 이름과 파라미터 동일해야- 파라미터는jsp 에 있
		
		int result = noticeService.setInsert(noticeDTO,files);
		
		
		
		
		
		
		
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
