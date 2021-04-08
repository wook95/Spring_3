package com.arc.s3.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.arc.s3.board.BoardDTO;
import com.arc.s3.util.Pager;
import com.arc.s3.util.Pager_backup;

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
	public ModelAndView setInsert(BoardDTO boardDTO,MultipartFile[] files)throws Exception{

		ModelAndView mv = new ModelAndView();
		int result = qnaService.setInsert(boardDTO,files);

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

		int result = qnaService.setReply(qnaDTO);

		return "redirect:./qnaList";
	}


	@PostMapping("qnaDelete")
	public ModelAndView setDelete(BoardDTO boardDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = qnaService.setDelete(boardDTO);

		String message = "삭제 실패";
		String path = "./qnaList";

		if(result>0) {
			message = "삭제 성공";

		}

		mv.addObject("path",path);
		mv.addObject("msg",message);

		mv.setViewName("common/commonResult");

		return mv;
	}

	@GetMapping("qnaUpdate")
	public String setUpdate(BoardDTO boardDTO,Model model) throws Exception{

		boardDTO = qnaService.getSelect(boardDTO);
		model.addAttribute("dto", boardDTO);
		model.addAttribute("board", "qna");
		return "board/boardUpdate";
	}

	@PostMapping("qnaUpdate")
	public ModelAndView setUpdate(BoardDTO boardDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = qnaService.setUpdate(boardDTO);

		if(result>0) {
			mv.setViewName("redirect:./qnaList");
		}else {
			mv.addObject("msg", "수정 실패");
			mv.addObject("path","./qnaList");
			mv.setViewName("common/commonResult");
		}

		return mv;
	}




}

