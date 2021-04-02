package com.arc.s3.member;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping (value = "/member/**")
public class MemberController {

	@Autowired
	private memberService memberService;
	
	@RequestMapping (value = "memberLogin")
	public void memberLogin() throws Exception{
		
	}
	
	@RequestMapping (value = "memberLogin", method = RequestMethod.POST)
	public String memberLogin(MemberDTO memberDTO, HttpSession session) throws Exception {
		memberDTO = memberService.memberLogin(memberDTO);
		session.setAttribute("member",memberDTO);		
		return "redirect:../";
	}
	
	@RequestMapping(value = "memberJoinCheck")
	public void memberJoinCheck()throws Exception{
		
	}
	
	
	@RequestMapping (value = "memberJoin")
	public void memberJoin() throws Exception{
		
	}
	
	
	@RequestMapping (value = "memberJoin", method = RequestMethod.POST)
	public String memberJoin(MemberDTO memberDTO,Model model) throws Exception{
//		int result  = memberService.memberJoin(memberDTO);
		
		Random random = new Random();
		int result = random.nextInt(2);
		String message = "회원가입실패";
		String path = "./memberJoin";
		
		if(result>0) {
		message ="회원이 되었습니다!";
		path="../";
		}
		
		model.addAttribute("msg",message);
		model.addAttribute("result",result);
		model.addAttribute("path",path);
		
		return "common/commonResult";
		
	}
	
	@RequestMapping (value = "memberLogout")
	public String memberLogout(HttpSession session) throws Exception {
		
		session.invalidate();
		return "redirect:../";
	}
	
	@RequestMapping(value = "memberPage")
	public void memberPage() throws Exception{
	}
	
	@RequestMapping(value= "memberDelete" )
	public String memberDelete(MemberDTO memberDTO,HttpSession session) throws Exception{
		memberDTO = (MemberDTO) session.getAttribute("member");
		int result = memberService.memberDelete(memberDTO);
		session.invalidate();
		return "redirect:../";
	}
	
	@RequestMapping(value = "memberUpdate")
	public void memberUpdate() throws Exception{
		

		
	}
	
	@RequestMapping(value = "memberUpdate", method=RequestMethod.POST)
	public String memberUpdate(MemberDTO memberDTO,HttpSession session) throws Exception{
		
		
		int result = memberService.memberUpdate(memberDTO);
		
		if(result>0) {
		session.setAttribute("member", memberDTO);
		}
		
		return "redirect:../";
		
	}
}
