package com.arc.s3.board.notice;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import com.arc.s3.board.BoardDAO;
import com.arc.s3.board.BoardDTO;
import com.arc.s3.util.Pager;

@Repository
public class NoticeDAO implements BoardDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.arc.s3.board.notice.NoticeDAO."; 
	
	
	public long getTotalCount(Pager pager) throws Exception{
		
		return sqlSession.selectOne(NAMESPACE+"getTotalCount",pager);
		
	}
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception{
		
//		HashMap<String, Long> map = new HashMap<String, Long>();
//		
//		map.put("startRow", 1L);
//		map.put("lastRow",10L);
		
	
		
		return sqlSession.selectList(NAMESPACE+"getList",pager);
		
	}
	
	
	@Override
	public NoticeDTO getSelect(BoardDTO boardDTO) throws Exception{
		
		
		return sqlSession.selectOne(NAMESPACE+"getSelect",boardDTO);
	}
	
	
	
	
	@Override
	public int setInsert(BoardDTO boardDTO) throws Exception {
		
		return sqlSession.insert(NAMESPACE+"setInsert",boardDTO);
		
	}
	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		
		return sqlSession.update(NAMESPACE+"setUpdate",boardDTO);
		
	}
	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		
		return sqlSession.delete(NAMESPACE+"setDelete", boardDTO);

	}

	@Override
	public int setHitUpdate(BoardDTO boardDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
}
