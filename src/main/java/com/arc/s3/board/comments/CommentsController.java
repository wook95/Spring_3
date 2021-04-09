package com.arc.s3.board.comments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import oracle.jdbc.proxy.annotation.Post;

@Controller
@RequestMapping("/comments/**")
public class CommentsController {

	@Autowired
	private CommentsService commentsService;
	
	
	@GetMapping("commentsList")
	public void getList(CommentsDTO commentsDTO,Model model) throws Exception {
		System.out.println(commentsDTO.getNum());
		List<CommentsDTO> ar = commentsService.getList(commentsDTO);
		model.addAttribute("list", ar);
		
		
	}
	
	@PostMapping("commentsInsert")
	public String setInsert(CommentsDTO commentsDTO,Model model)throws Exception{
		
		int result = commentsService.setInsert(commentsDTO);
		
		model.addAttribute("result", result);
		
	return	"common/ajaxResult";		
				
	}
	
	
	
	
}
