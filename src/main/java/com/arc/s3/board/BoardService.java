package com.arc.s3.board;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.arc.s3.board.notice.NoticeDTO;
import com.arc.s3.util.Pager;
import com.arc.s3.util.Pager_backup;


@Service
public interface BoardService {
	
	
	
	
	public List<BoardDTO> getList(Pager pager)throws Exception;
	
	public BoardDTO getSelect(BoardDTO noticeDTO) throws Exception;
	public int setInsert(BoardDTO noticeDTO) throws Exception;
	public int setUpdate(BoardDTO noticeDTO) throws Exception;
	public int setDelete(BoardDTO noticeDTO) throws Exception;
	
	
}
