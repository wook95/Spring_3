package com.arc.s3.board.comments;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommentsDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE ="com.arc.s3.board.comments.CommentsDAO.";
	
	
	public List<CommentsDTO> getList(CommentsDTO commentsDTO) throws Exception{
		
		return sqlSession.selectList(NAMESPACE+"getList", commentsDTO);
		
	}
	
	public int setInsert(CommentsDTO commentsDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"setInsert", commentsDTO);
	}
	
	
	public int commentsDelete(int[] commentsNum) throws Exception{
		
		int eachCommNum;
		int result=0;
		if(commentsNum != null) {
		for(int i=0;i<commentsNum.length;i++) {
			
			eachCommNum = commentsNum[i];
		sqlSession.delete(NAMESPACE+"commentsDelete", eachCommNum);
			
		}
		
			result=1;
		}
		
		return result;
	}
	
	
}
