package com.arc.s3.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.arc.s3.util.Pager;

@Controller
@RequestMapping(value = "/notice/**")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	
	@RequestMapping(value = "noticeUpdate")
	public String setUpdate(NoticeDTO noticeDTO) throws Exception{
		
		int result = noticeService.setUpdate(noticeDTO);
		return "./accountList";
		
	}
	@RequestMapping(value = "noticeDelete")
	public String setDelete(NoticeDTO noticeDTO) throws Exception{
		
		int result = noticeService.setDelete(noticeDTO);
		return "./accountList";
		
	}
	
	
	
	
	
	@RequestMapping(value = "noticeSelect")
	public void getSelect(NoticeDTO noticeDTO,Model model) throws Exception{
		
		
		noticeDTO = noticeService.getSelect(noticeDTO);
		model.addAttribute("dto",noticeDTO);
	}
	
	
	
	
	
	@RequestMapping(value = "noticeList")
	public ModelAndView getList (Pager pager) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		
		
//		System.out.println(pager.getCurPage());
		List<NoticeDTO> ar = noticeService.getList(pager);
//		System.out.println(pager.getTotalPage());
		
		
		mv.addObject("list", ar);
		mv.setViewName("notice/noticeList");
		mv.addObject("pager",pager);

		return mv;
		
	}
	
	
	
	
	
	@RequestMapping(value = "noticeInsert")
	public void setInsert() throws Exception{
		
	}

	@RequestMapping(value = "noticeInsert", method=RequestMethod.POST)
	public String setInsert(NoticeDTO noticeDTO) throws Exception{
		
		int result = noticeService.setInsert(noticeDTO);
		
		return "redirect:./noticeList";
	}
		
	
	
}
