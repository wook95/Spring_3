package com.arc.s3;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.arc.s3.board.notice.NoticeDAO;
import com.arc.s3.board.notice.NoticeDTO;
import com.arc.s3.member.MemberDAO;

public class NoticeUpTest extends MyAbstractTest {

	@Autowired
	private NoticeDAO noticeDAO;
	
	
	@Test
	public void test1()throws Exception{
		
		NoticeDTO noticeDTO = new NoticeDTO();
		
		noticeDTO.setNum(130);
		noticeDTO.setTitle("130");
		noticeDTO.setContents("tlqkf");
		
		
		
		noticeDAO.setUpdate(noticeDTO);
	
		
		
		
	}
	
	
	
	

}
