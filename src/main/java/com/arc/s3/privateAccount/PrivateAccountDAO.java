package com.arc.s3.privateAccount;

import java.util.Calendar;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PrivateAccountDAO {
	@Autowired
	private SqlSession sqlSession;
	//db 위치 알고 있는 애 세션이, 정확하게 어느 맵퍼를 쓰냐? 그건 ㄴ ㅔㅁ스페이스가
	private final String NAMESPACE = "com.arc.s3.privateAccount.PrivateAccountDAO.";
	

	public List<PrivateAccountDTO> getList(PrivateAccountDTO privateAccountDTO) throws Exception {
		
	return	sqlSession.selectList(NAMESPACE+"getList",privateAccountDTO);
		
	}
	
	
	public int setInsert(PrivateAccountDTO privateAccountDTO) throws Exception{
		
		
	
		
		
		
		return sqlSession.insert(NAMESPACE+"setInsert", privateAccountDTO);
	}
	
}
