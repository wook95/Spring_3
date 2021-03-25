package com.arc.s3.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO accountDAO;
	//defendncy가 있네??!
	//넣어주는것, injection
	//DI 해주자 -->오토와이어드
	
	public List<AccountDTO> getList() throws Exception {
		
		return accountDAO.getList();
	}
	
	
	public AccountDTO getSelect(AccountDTO accountDTO) throws Exception {
		
		
		return accountDAO.getSelect(accountDTO);
	}
	
	
	public int setDelte(AccountDTO accountDTO) throws Exception {
	
	return accountDAO.setDelete(accountDTO);
	}
	
	public int setUpdate(AccountDTO accountDTO) throws Exception{
		
		return accountDAO.setUpdate(accountDTO);		
	}
	
	
	
}
