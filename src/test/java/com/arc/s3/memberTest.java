package com.arc.s3;



import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.arc.s3.member.MemberDAO;
import com.arc.s3.member.MemberDTO;
import com.arc.s3.member.MemberFileDTO;

public class memberTest extends MyAbstractTest{

	@Autowired
	private MemberDAO memberDAO;

	
	@Test
	public void memberFileTest() throws Exception{
		
		MemberFileDTO memberFileDTO = new MemberFileDTO();
		memberFileDTO.setId("id1");
		memberFileDTO.setFileName("130");
		memberFileDTO.setOriginName("1330");
		
		int result =memberDAO.setFileInsert(memberFileDTO);
		assertNotEquals(0, result);
		
	}
	
	
	
	
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
//
//	
//	public void memberLoginTest() throws Exception {
//		
//		MemberDTO memberDTO = new MemberDTO();
//		memberDTO.setId("id5");
//		memberDTO.setPw("0905");
//		
//		memberDTO=memberDAO.memberLogin(memberDTO);
//		assertNotNull(memberDTO);
//		
//	}
//	
//	@Test
//	public void memberUpdateTest() throws Exception{
//		
//		
//		MemberDTO memberDTO = new MemberDTO();
//		memberDTO.setId("id5");
//		memberDTO.setPw("0905");
//		memberDTO = memberDAO.memberLogin(memberDTO);
//		
//		memberDTO.setName("dustntl");
//		
//		int result = memberDAO.memberUpdate(memberDTO);
//		assertNotEquals(0, result);	
//	}
//	
//	@Test
//	public void memberDeleteTest() throws Exception {
//		
//		MemberDTO memberDTO = new MemberDTO();
//		memberDTO.setId("dldnrckd");
//		
//		int result = memberDAO.memberDelete(memberDTO);
//		assertNotEquals(0, result);
//	}
//	
	
	
	
}
