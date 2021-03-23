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
			
			
			
			//Delete member where id=?
			
			
			
			return 0;
		}
		
		
		public int memberUpdate(MemberDTO memberDTO) throws Exception{
			
			
			//update member set name = 'ddd', phone='' wehre id='222'
			return 0;
		}
		
		
	}