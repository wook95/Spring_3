package com.arc.s3.board.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.arc.s3.board.BoardDAO;
import com.arc.s3.board.BoardDTO;
import com.arc.s3.util.Pager;
import com.arc.s3.util.Pager_backup;


@Repository
public class QnaDAO  implements BoardDAO{

	@Autowired
	SqlSession sqlSession;
	//어느 메퍼 쓸지 정해조라~
	final String namespace = "com.arc.s3.board.qna.QnaDAO.";
	
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		
		return sqlSession.selectList(namespace+"getList",pager);
	}


	@Override
	public long getTotalCount(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public BoardDTO getSelect(BoardDTO boardDTO) throws Exception {
		
		return sqlSession.selectOne(namespace+"getSelect",boardDTO);
	}


	@Override
	public int setHitUpdate(BoardDTO boardDTO) {
		// TODO Auto-generated method stub
		return sqlSession.update(namespace+"setHitUpdate", boardDTO);
	}


	@Override
	public int setInsert(BoardDTO boardDTO) throws Exception {
		
		return sqlSession.insert(namespace+"setInsert", boardDTO);
	}


	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		
		return sqlSession.update(namespace+"setUpdate", boardDTO);
	}


	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		return sqlSession.delete(namespace+"setDelete", boardDTO);
	}
	
	
	public int setReplyUpdate(QnaDTO qnaDTO) throws Exception{
		
		return sqlSession.update(namespace+"setReplyUpdate", qnaDTO);
		
	}
	public int setReply(QnaDTO qnaDTO) throws Exception{
		
		return sqlSession.insert(namespace+"setReply", qnaDTO);
		
	}
	
	
	
}
