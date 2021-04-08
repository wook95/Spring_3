package com.arc.s3.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class MemberDAO {

	
	@Autowired
	private SqlSession sqlSession;
	//xml에서 만든 개체라 오토 와이어드 해줬다
	
	private String NAMESPACE = "com.arc.s3.member.MemberDAO";
	
	
	
	//login - id pw를 받아서 조회
	
	public int memberJoin(MemberDTO mDTO) throws Exception{
		
		//새로운 멤버 입
		//insert into member values (,,,,)
		return sqlSession.insert(NAMESPACE+".memberJoin", mDTO);
		
		
	}

	public MemberDTO memberLogin(MemberDTO memberDTO)throws Exception{
		
		
		//id, pw 	받아서 출력 전체
		//select * from member where id=? pw=?
		return sqlSession.selectOne(NAMESPACE+".memberLogin", memberDTO);
		
	
	}
		
		
		public int memberDelete(MemberDTO memberDTO) throws Exception {
			
			
			return sqlSession.delete(NAMESPACE+".memberDelete", memberDTO);
			
		
			
		}
		
		
		public int memberUpdate(MemberDTO memberDTO) throws Exception{
			
		return	sqlSession.update(NAMESPACE+".memberUpdate", memberDTO);
			
			//update member set name = 'ddd', phone='' wehre id='222'
			
		}
		
		
		public MemberFileDTO memberLoginFile(MemberDTO memberDTO)throws Exception{
			
			return sqlSession.selectOne(NAMESPACE+".memberLoginFile", memberDTO);
		}
		
		
		
		
		
		//setFileInsert
		public int setFileInsert(MemberFileDTO memberFileDTO) throws Exception{
			
			return sqlSession.insert(NAMESPACE+".setFileInsert",memberFileDTO);
			
		}
		
		
	}