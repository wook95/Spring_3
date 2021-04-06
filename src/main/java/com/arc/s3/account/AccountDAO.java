package com.arc.s3.account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.arc.s3.util.Pager_backup;



@Repository
public class AccountDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE ="com.arc.s3.account.AccountDAO";
		
	
	
	
	
	public long getTotalCount()throws Exception{
		
		return sqlSession.selectOne(NAMESPACE+".getTotalCount");
	}
	
	
	
	public List<AccountDTO> getList(Pager_backup pager) throws Exception{
		
		
	return	sqlSession.selectList(NAMESPACE+".getList",pager);
		
		
	
	}
	
	
	public AccountDTO getSelect(AccountDTO accountDTO) throws Exception{
		
		//long num = 1L;
		
		accountDTO= sqlSession.selectOne(NAMESPACE+".getSelect", accountDTO);
		
		return accountDTO;
		
		
	}
	
	public int setWrite(AccountDTO accountDTO) throws Exception {
		
		int result = sqlSession.insert(NAMESPACE+".setWrite",accountDTO);
		
		return result;
		
		
		
	}
	
	public int setDelete(AccountDTO accountDTO) throws Exception {
		
		
		
		return sqlSession.delete(NAMESPACE+".setDelete",accountDTO);
	}
	
public int setUpdate(AccountDTO accountDTO) throws Exception{
		
		return sqlSession.update(NAMESPACE+".setUpdate",accountDTO);
		
	}
	
}
