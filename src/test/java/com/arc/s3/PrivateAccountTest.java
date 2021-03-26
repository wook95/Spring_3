package com.arc.s3;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.arc.s3.privateAccount.PrivateAccountDAO;
import com.arc.s3.privateAccount.PrivateAccountDTO;

public class PrivateAccountTest extends MyAbstractTest {

	@Autowired
	private PrivateAccountDAO privateAccountDAO;
	
	@Test
	public void getListTest() throws Exception {
		
		PrivateAccountDTO privateAccountDTO = new PrivateAccountDTO();
		privateAccountDTO.setUser_id("id1");
		
		List<PrivateAccountDTO> ar = privateAccountDAO.getList(privateAccountDTO);
		
		assertNotEquals(0, ar.size());
		
	}

	
	@Test
	public void setInsertTest() throws Exception{
		
		PrivateAccountDTO privateAccountDTO = new PrivateAccountDTO();
		privateAccountDTO.setBalance(0);
		privateAccountDTO.setUser_id("id1");
		privateAccountDTO.setAccountNumber("01010101-11");
		privateAccountDTO.setAccountId(10);
		int result = privateAccountDAO.setInsert(privateAccountDTO);
		assertEquals(1, result);
		
	}
	
	
	
	
}


