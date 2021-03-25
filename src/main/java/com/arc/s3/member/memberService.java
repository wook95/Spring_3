package com.arc.s3.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class memberService {

	@Autowired
	private MemberDAO memberDAO;
	
	
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		return memberDAO.memberJoin(memberDTO);
	}
	
	
	
	public MemberDTO memberLogin(MemberDTO memberDTO)throws Exception{
		//id, pw 	받아서 출력 전체
		//select * from member where id=? pw=?
		return memberDAO.memberLogin(memberDTO);
		
	
	}
	
	public int memberDelete(MemberDTO memberDTO) throws Exception{
		
		return memberDAO.memberDelete(memberDTO);
	}
	
	public int memberUpdate(MemberDTO memberDTO) throws Exception{
		
		return memberDAO.memberUpdate(memberDTO);
	}
}
