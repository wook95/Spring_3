package com.arc.s3.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arc.s3.util.Pager;


@Service
public class NoticeService {

	@Autowired
	private NoticeDAO noticeDAO;
	
	
	
	
	
	public NoticeDTO getSelect(NoticeDTO noticeDTO) throws Exception{
		
		return noticeDAO.getSelect(noticeDTO);
		
	}
	
	
	
	public List<NoticeDTO> getList(Pager pager) throws Exception{
		
//		Pager pager = new Pager();
//		long perPage   = 10L;
//		pager.setStartRow((curPage-1)*perPage+1);
//		pager.setLastRow(curPage*perPage);
//		return noticeDAO.getList(pager);
		
		int perPage = 12; // 페이지당 보여줄 게시물의 갯수
		int perBlock = 5; // 한번에 보여줄 숫자의 갯수
		
		
		//start, last row 계산
		
		long startRow = (pager.getCurPage()-1) * perPage +1;
		long lastRow = pager.getCurPage()*perPage;	
		pager.setStartRow(startRow);
		pager.setLastRow(lastRow);
		
		
		// 	1. totalCount			밑에 써질 번호,
		long totalCount = noticeDAO.getTotalCount();
		
		
		//	2. totlaPage
		long totalPage = totalCount / perPage;		//9.5
		if(totalCount%perPage != 0) {
			totalPage++;
		}
		
		
		
		//	3. totalBlock (페이지 밑에 있는 게시물을 나누는 인덱스)
		
		
//		long totalBlock = (long)Math.ceil((double)totalPage/perBlock);
		long totalBlock = totalPage/perBlock;
		if(totalPage%perBlock != 0) {
			totalBlock++;
		}
	
		// 4. curblock
		
		long curBlock = (pager.getCurPage() / perBlock);
		if (pager.getCurPage() % perBlock !=0)curBlock++;
		
		System.out.println("total block"+totalBlock);	
		System.out.println("블럭 번호 : " +curBlock);
		
		
		//5. startNum, lastNum --> 둘다 jsp 로 보내줘야 ,,
		
		long startNum= (curBlock-1)*perBlock+1;
		long lastNum = curBlock*perBlock;
		
		
		
		
		
		pager.setStartNum(startNum);
		pager.setLastNum(lastNum);
		
		
		
		
		return noticeDAO.getList(pager);
	}
	
	
	public int setInsert(NoticeDTO noticeDTO) throws Exception {
		
		return noticeDAO.setInsert(noticeDTO);
		
	}
	public int setUpdate(NoticeDTO noticeDTO) throws Exception {
		
		return noticeDAO.setUpdate(noticeDTO);
		
	}
	public int setDelete(NoticeDTO noticeDTO) throws Exception {
		
		return noticeDAO.setDelete(noticeDTO);
		
	}
	
	
	
}
