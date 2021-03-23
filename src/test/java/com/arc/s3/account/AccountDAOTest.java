package com.arc.s3.account;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.arc.s3.MyAbstractTest;

public class AccountDAOTest extends MyAbstractTest{


	
	@Autowired
	private AccountDAO accountDAO;
	
//	@Test
//	public void getSelectTest() throws Exception{
//		
//		AccountDTO accountDTO = accountDAO.getSelect(null);
//		assertNotNull(accountDTO);
//		
//
//	}
	
	
	
	@Test
	public void setWrite() throws Exception {
		
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setAccountName("test");
		accountDTO.setRate(0.765);
		accountDTO.setAccountSale("Y");
		
		int result = accountDAO.setWrite(accountDTO);
		
		assertEquals(1, result);
		
	}
	
	
	@Test
	public void getListTest() throws Exception{
		
		List<AccountDTO> ar = accountDAO.getList();
		assertNotEquals(0, ar.size());
		
	}
	

}
