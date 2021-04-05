package com.arc.s3;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.arc.s3.board.notice.NoticeDAO;
import com.arc.s3.board.notice.NoticeDTO;

public class NoticeTest extends MyAbstractTest{

	@Autowired
	private NoticeDAO noticeDAO;

	
	@Test
	public void noticeInsertTest()  throws Exception{
		
		for(int i=30;i<120;i++) {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setWriter("dnrckd"+i);
		noticeDTO.setTitle("teststeste234"+i);
		noticeDTO.setContents("testeste"+i);
		noticeDTO.setHit(0);
		int result = noticeDAO.setInsert(noticeDTO);
			if(i%10==0) {
		Thread.sleep(500);}
		}
//		assertNotEquals(0, result);
	}
	
	
	
//	@Test
//	public void noticeGetListTest() throws Exception{
//		
//		
//		
//	List<NoticeDTO> ar = noticeDAO.getList();
//	
//	assertNotNull(ar);
//		
//		
//	}
	
//	@Test
//	public void noticeSetUpdateTest() throws Exception{
//		
//		NoticeDTO noticeDTO = new NoticeDTO();
//		noticeDTO.setNum(9);
//		noticeDAO.setUpdate(noticeDTO);
//	}
//	
	

}
