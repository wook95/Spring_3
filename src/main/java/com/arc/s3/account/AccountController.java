package com.arc.s3.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	
	@RequestMapping(value = "/account/accountAdd")
	public void accountAdd()throws Exception {
		
		
		
	}
	
	@RequestMapping(value = "/account/accountAdd", method = RequestMethod.POST)
	public void accountAdd2(AccountDTO accountDTO,ModelAndView modelAndView) throws Exception{
		int result = accountService.setWrite(accountDTO);
		
		
	}
	
	//-----------------------------------------------
	
	@RequestMapping(value = "/account/accountList")
	public void accountList(Model model) throws Exception{
	List<AccountDTO> ar =accountService.getList();
	model.addAttribute("list", ar);
	model.addAttribute("kind", "account");
	}
	
	
	//------------------------------------------
	@RequestMapping(value = "/account/accountSelect")
	public ModelAndView accountSelect(AccountDTO accountDTO) throws Exception{
		
		accountDTO=accountService.getSelect(accountDTO);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("dto",accountDTO);
		modelAndView.setViewName("account/accountSelect");
		
		return modelAndView;

		
	}
	//------------------------------------------------
	
	@RequestMapping(value = "/account/accountUpdate")
	public void accountUpdate() throws Exception{
		
	}
	@RequestMapping(value = "/account/accountUpdate",method = RequestMethod.POST)
	public void accountUpdate2() throws Exception{
		
	}
	
	//-----------------------------------------------
	
	@RequestMapping(value="/account/accountDelete")
	public void accountDelete() throws Exception{
		
		
		
	}
}
