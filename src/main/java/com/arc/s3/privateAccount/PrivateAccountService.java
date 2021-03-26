package com.arc.s3.privateAccount;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrivateAccountService {

	@Autowired
	private PrivateAccountDAO privateAccountDAO;
	
	public List<PrivateAccountDTO> getList(PrivateAccountDTO privateAccountDTO) throws Exception{
		
		return privateAccountDAO.getList(privateAccountDTO);
		
	}
	
	
	public int setInsert (PrivateAccountDTO privateAccountDTO)throws Exception{
		
		Calendar ca = Calendar.getInstance();
		long time = ca.getTimeInMillis();
		System.out.println(time);
		
		String t = time+"";
		t = String.valueOf(time);
		String result = t.substring(0,4)+"-";//0123-
		result = result+ t.substring(4, 8)+"-";//0123-4567
		result = result+ t.substring(8);
		System.out.println(result);
		
		SimpleDateFormat sd = new SimpleDateFormat("ddyyyyMM-HHmmss-S");
		String r = sd.format(ca.getTime());
		System.out.println(r);
		
		privateAccountDTO.setAccountNumber(r);
//		String name = UUID.randomUUID().toString();
//		System.out.println(name);
		
		
		
		return privateAccountDAO.setInsert(privateAccountDTO);
	}
	
}
