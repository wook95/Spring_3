package com.arc.s3.account;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
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
//	
	
	
	@Test
	public void setWrite() throws Exception {
		
		for(int i=0;i<200;i++) {
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setAccountName("accountName"+i);
		accountDTO.setRate(0.012);
		accountDTO.setAccountSale("Y");
		
		int result = accountDAO.setWrite(accountDTO);
		
		if(i%100==0) {
		Thread.sleep(500);
		}
		
		}
		System.out.println("반복종료");
		//		assertEquals(1, result);
		
	}
	
	
//	@Test
//	public void getListTest() throws Exception{
//		
//		List<AccountDTO> ar = accountDAO.getList();
//		assertNotEquals(0, ar.size());
//		
//	}
//	
//	@Test
//	public void setDelete() throws Exception {
//		
//		AccountDTO accountDTO = new AccountDTO();
//		accountDTO.setAccountId(10);
//		int result = accountDAO.setDelete(accountDTO);
//		
//		assertEquals(1, result);
//		
//	}
//	
//	@Test
//	public void setUpdateTest() throws Exception{
//		
//		AccountDTO accountDTO = new AccountDTO();
//		accountDTO.setAccountId(5);
//		
//		accountDTO = accountDAO.getSelect(accountDTO);
//		
//		
//		
//		accountDTO.setAccountName("changeeeee");
//	
//		int result = accountDAO.setUpdate(accountDTO);
//		assertEquals(1, result);
//		
//	}
	

}
