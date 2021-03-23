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
			
			//1. 로그인 정보 
			String user="user01";
			String password="user01";
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String driver = "oracle.jdbc.driver.OracleDriver";
			
			//2. 클래스 로딩
			Class.forName(driver);
			
			//3. 로그인 Connection
			Connection con = DriverManager.getConnection(url, user, password);
			
			
			//4. SQL문 생성
			String sql ="SELECT * FROM member WHERE id=? and pw=?";
			
			//5. 미리 보내기
			PreparedStatement st = con.prepareStatement(sql);
			
			//6. ? 세팅
			st.setString(1, memberDTO.getId());
			st.setString(2, memberDTO.getPw());
			
			//7. 최종 전송 후 처리
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				memberDTO.setName(rs.getString("name"));
				memberDTO.setEmail(rs.getString("email"));
				memberDTO.setPhone(rs.getString("phone"));
			}else {
				memberDTO = null;
			}
			
			//8. 해제
			rs.close();
			st.close();
			con.close();
			
			return memberDTO;
		}
		
		
		
		
		
		
		
		
		
		public int memberJoin(MemberDTO mDTO) throws Exception{
			
			String user="user01";
			String password="user01";
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String driver = "oracle.jdbc.driver.OracleDriver";
			
			//2. 클래스 로딩
			Class.forName(driver);
			
			//3. 로그인 Connection
			Connection con = DriverManager.getConnection(url, user, password);
			
			
			
			String sql = "insert into member values(?,?,?,?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, mDTO.getId());
			st.setString(2, mDTO.getPw());
			st.setString(3, mDTO.getName());
			st.setString(4, mDTO.getPhone());
			st.setString(5, mDTO.getEmail());
			
			int result = st.executeUpdate();
			
			
			
			
			st.close();
			con.close();
			
			return result;
		}
		
		
		public int memberDelete(MemberDTO memberDTO) throws Exception {
			
			
			return 0;
		}
		
		
		public int memberUpdate(MemberDTO memberDTO) throws Exception{
			
			return 0;
		}
		
		
	}