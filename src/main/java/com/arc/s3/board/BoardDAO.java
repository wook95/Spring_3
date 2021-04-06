package com.arc.s3.board;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.arc.s3.util.Pager;
import com.arc.s3.util.Pager_backup;


@Repository
public interface BoardDAO {
	//상수와 추상메서드만 가짐
	//접근지정자는 무족권 public abstract
	//무족권이라 생략 가능가능 삽가능
	
	
	
	//list
	
	public abstract List<BoardDTO> getList(Pager pager) throws Exception;
	
	
	
	//전체 글의갯수
	
	public long getTotalCount(Pager pager)throws Exception;
	
	//글 조회
	public BoardDTO getSelect(BoardDTO boardDTO)throws Exception;
	
	
	
	//setHItupdadate
	
	public int setHitUpdate(BoardDTO boardDTO);
	
	
	
	
	
	
	//글 추가
	public int setInsert(BoardDTO boardDTO) throws Exception;
	
	
	//글 수
	
	public int setUpdate(BoardDTO boardDTO) throws Exception;
	
	
	//글삭
	public int setDelete(BoardDTO boardDTO) throws Exception;
	
	
	
	
	
}
