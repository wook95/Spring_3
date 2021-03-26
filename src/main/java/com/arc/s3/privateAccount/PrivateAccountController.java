package com.arc.s3.privateAccount;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arc.s3.member.MemberDTO;

@Controller
@RequestMapping(value = "/privateAccount/**")
public class PrivateAccountController {

	@Autowired
	private PrivateAccountService privateAccountService;
	
	
	
	@RequestMapping(value = "privateAccountInsert")
	public String setInsert(HttpSession session, PrivateAccountDTO privateAccountDTO) throws Exception{
		MemberDTO memberDTO =  (MemberDTO)session.getAttribute("member");
		privateAccountDTO.setUser_id(memberDTO.getId());
		int result = privateAccountService.setInsert(privateAccountDTO);
		
		return "redirect:./privateAccountList";
	}

	
	
	@RequestMapping(value= "privateAccountList")
	public void getList(HttpSession session,Model model) throws Exception{
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		PrivateAccountDTO privateAccountDTO = new PrivateAccountDTO();
		privateAccountDTO.setUser_id(memberDTO.getId());
	
		List<PrivateAccountDTO> ar =privateAccountService.getList(privateAccountDTO);
		model.addAttribute("list", ar);
	}
	
	
	
	
}
