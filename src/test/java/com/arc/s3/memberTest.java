package com.arc.s3;



import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.arc.s3.member.MemberDAO;
import com.arc.s3.member.MemberDTO;

public class memberTest extends MyAbstractTest{

	@Autowired
	private MemberDAO memberDAO;
	
//	@Test
//	public void memberJoinTest() throws Exception{
//		
//		MemberDTO memberDTO = new MemberDTO();
//		memberDTO.setId("dldnrckfd");
//		memberDTO.setPw("dldnrckddlrn");		
//		memberDTO.setName("james");
//		memberDTO.setPhone("0101010");
//		memberDTO.setEmail("email@gmail.com");
//		
//		
//		int result = memberDAO.memberJoin(memberDTO);
//		
//		assertNotEquals(0,result);
//	}

	@Test
	public void memberLoginTest() throws Exception {
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id5");
		memberDTO.setPw("0905");
		
		memberDTO=memberDAO.memberLogin(memberDTO);
		
		
	}
	
}
