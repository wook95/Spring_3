package com.arc.s3.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arc.s3.board.BoardDTO;
import com.arc.s3.board.BoardService;
import com.arc.s3.util.Pager;


@Service
public class QnaService implements BoardService {

	@Autowired
	private QnaDAO qnaDAO;
	
	
	public int setReply(QnaDTO qnaDTO)throws Exception{
		
		
		// 부모글의 step, depth, ref 조회
		BoardDTO boardDTO = qnaDAO.getSelect(qnaDTO);
		QnaDTO parent =(QnaDTO)boardDTO;
		System.out.println(parent.getRef());
		System.out.println(parent.getStep());
		System.out.println(parent.getDepth());
		
		qnaDTO.setRef(parent.getRef());
		qnaDTO.setStep(parent.getStep()+1);
		qnaDTO.setDepth(parent.getDepth()+1);
		
		int result = qnaDAO.setReplyUpdate(parent);
		result = qnaDAO.setReply(qnaDTO);
		
		return result = result;
	}
	
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.getList(pager);
	}



	@Override
	public BoardDTO getSelect(BoardDTO noticeDTO) throws Exception {
		
		int result = qnaDAO.setHitUpdate(noticeDTO);
		return qnaDAO.getSelect(noticeDTO);
	}



	@Override
	public int setInsert(BoardDTO boardDTO) throws Exception {
		
		return qnaDAO.setInsert(boardDTO);
	}



	@Override
	public int setUpdate(BoardDTO noticeDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int setDelete(BoardDTO noticeDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
	
	
	
	
	
	
}
