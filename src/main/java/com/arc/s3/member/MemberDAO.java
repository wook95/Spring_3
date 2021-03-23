package com.arc.s3.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;


@Repository
public class MemberDAO {

	

	
	
	
	
	//login - id pw를 받아서 조회
	
		public MemberDTO memberLogin(MemberDTO memberDTO)throws Exception{
			

			//id, pw 	받아서 출력 전체
			
			return memberDTO;
		}

		public int memberJoin(MemberDTO mDTO) throws Exception{
			
			//새로운 멤버 입
			
			return 0;
		}
		
		
		public int memberDelete(MemberDTO memberDTO) throws Exception {
			
			
			return 0;
		}
		
		
		public int memberUpdate(MemberDTO memberDTO) throws Exception{
			
			return 0;
		}
		
		
	}