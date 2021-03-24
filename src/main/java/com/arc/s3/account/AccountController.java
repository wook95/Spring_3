package com.arc.s3.account;

import java.io.OutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping(value="/account/**")
public class AccountController {
	
		
	@Autowired
	private AccountService accountService;
	
	
	@RequestMapping(value = "accountList")
	public void getList(Model model) throws Exception{
		
		List<AccountDTO> ar = accountService.getList();
		model.addAttribute("list",ar);
		//jsp로 메서드 보내줌
		
	}
	
	@RequestMapping(value = "accountSelect")
	public ModelAndView getSelect(AccountDTO accountDTO) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		accountDTO = accountService.getSelect(accountDTO);
		
		modelAndView.addObject("dto",accountDTO);
		modelAndView.setViewName("account/accountSelect");
		return modelAndView;
	}
	
	
	@RequestMapping(value = "accountDelete")
	public String setDelete(AccountDTO accountDTO) throws Exception{
		
		System.out.println(accountDTO.getAccountId());
		int result = accountService.setDelte(accountDTO);
		
		
		return "redirect:./accountList";
	}
	
	
	
	
	@RequestMapping(value="accountUpdate", method = RequestMethod.POST)
	public String setUpdate(AccountDTO accountDTO) throws Exception{
		
		int result = accountService.setUpdate(accountDTO);
		return "redirect:./accountList";
	}
	
	@RequestMapping(value = "accountUpdate")
	public void setUpdate2(AccountDTO accountDTO, Model model) throws Exception{
		
		accountDTO = accountService.getSelect(accountDTO);
		model.addAttribute("dto", accountDTO);
		
	}
	

	
}
