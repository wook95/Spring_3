package com.arc.s3;

import static org.junit.Assert.*;

import org.junit.Test;

import com.arc.s3.member.MemberDAO;
import com.arc.s3.member.MemberDTO;

public class memberTest extends MyAbstractTest{


	private MemberDAO memberDAO;
	
	public void memberJoinTest() throws Exception{
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("dldnrckd");
		memberDTO.setPw("dldnrckddlrn");		
		memberDTO.setName("james");
		memberDTO.setPhone("0101010");
		memberDTO.setEmail("email@gmail.com");
		
		
		memberDAO.memberJoin(memberDTO);
		
	}

}
