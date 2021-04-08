package com.arc.s3.board.notice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import com.arc.s3.board.BoardDTO;
import com.arc.s3.board.BoardFileDTO;
import com.arc.s3.board.BoardService;
import com.arc.s3.util.FileManager;
import com.arc.s3.util.Pager;
import com.arc.s3.util.Pager_backup;


@Service
public class NoticeService implements BoardService {

	@Autowired
	private NoticeDAO noticeDAO;
	
	@Autowired
	private FileManager fileManager;

	@Autowired
	private HttpSession session;
	//junit test에서는 세션 선언 안된다..! 실제 클라이언트가 들어와야 세선 나옴
	
	
	public BoardDTO getSelect(BoardDTO boardDTO) throws Exception{
		
		
		
		return noticeDAO.getSelect(boardDTO);
		
	}
	
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception{
		
		
		
//		int perPage = 12; // 페이지당 보여줄 게시물의 갯수
//		int perBlock = 5; // 한번에 보여줄 숫자의 갯수
		
		
		//start, last row 계산
		
//		long startRow = (pager.getCurPage()-1) * perPage +1;
//		long lastRow = pager.getCurPage()*perPage;	
//		pager.setStartRow(startRow);
//		pager.setLastRow(lastRow);
		
		pager.makeRow();
		
		
		
		// 	1. totalCount	총 갯수//	
		long totalCount = noticeDAO.getTotalCount(pager);
		
		
//		//	2. totlaPage  //마지막 페이지 (밑에 써질 번호)
//		long totalPage = totalCount / perPage;		//9.5
//		if(totalCount%perPage != 0) {
//			totalPage++;
//		}
//		
//		
//		
//		//	3. totalBlock (페이지 밑에 있는 번호들의 집합인데 그중 끝)
//		
//		
////		long totalBlock = (long)Math.ceil((double)totalPage/perBlock);
//		long totalBlock = totalPage/perBlock;
//		if(totalPage%perBlock != 0) {
//			totalBlock++;
//		}
//	
//		// 4. curblock
//		
//		long curBlock = (pager.getCurPage() / perBlock);
//		if (pager.getCurPage() % perBlock !=0)curBlock++;
//		
//		
//		
//		
//		//5. startNum, lastNum --> 둘다 jsp 로 보내줘야 ,,
//		
//		long startNum= (curBlock-1)*perBlock+1;
//		long lastNum = curBlock*perBlock;
//		
//		//6. 마지막 블럭의 마지막번호에서 끝나고 싶을떄 ,,
//		// curBlock이 마지막 block (total block)
//		
//		if(curBlock==totalBlock) {
//			lastNum = totalPage;
//		}
//		
//		
//		
//		
//		//7. 이전, 다음 block 존재 여부
//		
//		//이전
//		if(curBlock != 1) {
//			pager.setPre(true);
//		}
//		//다음
//		if(curBlock != totalBlock) {
//			pager.setNext(true);
//		}
//		
//		
//		
//		
//		
//		
//		
//		pager.setStartNum(startNum);
//		pager.setLastNum(lastNum);
//		
//		
//		
		pager.makeNum(totalCount);
		
		
		
		return noticeDAO.getList(pager);
	}
	
	
	public int setInsert(BoardDTO boardDTO,MultipartFile[] files) throws Exception {
		
		long num=noticeDAO.getNum();
		boardDTO.setNum(num);
		
		int result = noticeDAO.setInsert(boardDTO);
		//만들어진 후 글번호 찾아오기
		
		
		
		for(MultipartFile mf : files) {
			BoardFileDTO boardFileDTO = new BoardFileDTO();
			String fileName = fileManager.save("notice", mf, session);
			
			boardFileDTO.setNum(num);
			boardFileDTO.setFileName(fileName);
			boardFileDTO.setOriginName(mf.getOriginalFilename());
			
			noticeDAO.setFileInsert(boardFileDTO);
		}
		
		return result;
		
	}
	
	
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		
		return noticeDAO.setUpdate(boardDTO);
		
	}
	public int setDelete(BoardDTO boardDTO) throws Exception {
		
		return noticeDAO.setDelete(boardDTO);
		
	}




		
	
	
}
