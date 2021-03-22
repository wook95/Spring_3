package com.arc.s3.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

	@Autowired
	private AccountDAO accountDAO;
	
	
	public List<AccountDTO> getList() throws Exception{
		
		
		List<AccountDTO> ar = accountDAO.getList();
		
		return ar;
		
	}
	
	public AccountDTO getSelect(AccountDTO accountDTO) throws Exception{
		
		
		return accountDAO.getSelect(accountDTO);
	}
	
	public int setWrite(AccountDTO accountDTO) throws Exception {
		
	return	accountDAO.setWrite(accountDTO);
		
		
		
	}
	
	
}
