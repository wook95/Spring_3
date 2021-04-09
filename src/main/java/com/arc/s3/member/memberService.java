package com.arc.s3.member;

import java.io.File;
import java.util.Calendar;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.arc.s3.util.FileManager;

@Service
public class memberService {

	@Autowired
	private MemberDAO memberDAO;
	
	@Autowired
	private FileManager filemanager;
	
	
	
	
	public int memberJoin(MemberDTO memberDTO,MultipartFile avatar, HttpSession httpSession) throws Exception {
		
		String fileName = filemanager.save("member", avatar, httpSession);
		MemberFileDTO memberFileDTO = new MemberFileDTO();
		memberFileDTO.setId(memberDTO.getId());
		memberFileDTO.setOriginName(avatar.getOriginalFilename());
		memberFileDTO.setFileName(fileName);
		
		
		int result = memberDAO.memberJoin(memberDTO);
		result =  memberDAO.setFileInsert(memberFileDTO);
		return  result;
	}
	
	
	
	public MemberDTO memberLogin(MemberDTO memberDTO)throws Exception{
		//id, pw 	받아서 출력 전체
		//select * from member where id=? pw=?
		
		memberDTO =  memberDAO.memberLogin(memberDTO);
		MemberFileDTO memberFileDTO = memberDAO.memberLoginFile(memberDTO);
		memberDTO.setMemberFileDTO(memberFileDTO);
		
		
		return memberDTO;
	
	}
	
	public int memberDelete(MemberDTO memberDTO,HttpSession session) throws Exception{
		
		MemberFileDTO memberFileDTO = memberDAO.getMemberFile(memberDTO);
		//지울라고 하는 이름 파일디티오에 넣어놈~!~!
		//메서드로 만들어보자 - 파일메니저
		boolean check = filemanager.delete("member", memberFileDTO.getFileName(), session);
		return memberDAO.memberDelete(memberDTO);
	}
	
	public int memberUpdate(MemberDTO memberDTO) throws Exception{
		
		return memberDAO.memberUpdate(memberDTO);
	}
}


	
