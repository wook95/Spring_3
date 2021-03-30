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
		
		
		// 	1. totalCount	총 갯수//	
		long totalCount = noticeDAO.getTotalCount(pager);
		
		
		//	2. totlaPage  //마지막 페이지 (밑에 써질 번호)
		long totalPage = totalCount / perPage;		//9.5
		if(totalCount%perPage != 0) {
			totalPage++;
		}
		
		
		
		//	3. totalBlock (페이지 밑에 있는 번호들의 집합인데 그중 끝)
		
		
//		long totalBlock = (long)Math.ceil((double)totalPage/perBlock);
		long totalBlock = totalPage/perBlock;
		if(totalPage%perBlock != 0) {
			totalBlock++;
		}
	
		// 4. curblock
		
		long curBlock = (pager.getCurPage() / perBlock);
		if (pager.getCurPage() % perBlock !=0)curBlock++;
		
		
		
		
		//5. startNum, lastNum --> 둘다 jsp 로 보내줘야 ,,
		
		long startNum= (curBlock-1)*perBlock+1;
		long lastNum = curBlock*perBlock;
		
		//6. 마지막 블럭의 마지막번호에서 끝나고 싶을떄 ,,
		// curBlock이 마지막 block (total block)
		
		if(curBlock==totalBlock) {
			lastNum = totalPage;
		}
		
		
		
		
		//7. 이전, 다음 block 존재 여부
		
		//이전
		if(curBlock != 1) {
			pager.setPre(true);
		}
		//다음
		if(curBlock != totalBlock) {
			pager.setNext(true);
		}
		
		
		
		
		
		
		
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
