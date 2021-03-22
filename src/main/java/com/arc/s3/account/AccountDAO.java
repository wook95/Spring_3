package com.arc.s3.account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;



@Repository
public class AccountDAO {

	
	
	public List<AccountDTO> getList() throws Exception{
		String user="user01";
		String password="user01";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
	
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql="select * from account";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		ArrayList<AccountDTO> ar = new ArrayList<AccountDTO>();
		
		while(rs.next()) {
			AccountDTO accountDTO = new AccountDTO();
			accountDTO.setAccountId(rs.getLong("accountID"));
			accountDTO.setAccountName(rs.getString("accountName"));
			accountDTO.setRate(rs.getDouble("rate"));
			accountDTO.setAccountSale(rs.getString("accountSale"));
			ar.add(accountDTO);
			
		}
		rs.close();
		st.close();
		con.close();
		
		
		return ar;	
	}
	
	
	public AccountDTO getSelect(AccountDTO accountDTO) throws Exception{
		
		String user="user01";
		String password="user01";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
	
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "select * from account where accountId =?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setLong(1, accountDTO.getAccountId());
		ResultSet rs = st.executeQuery();
		
		
		if(rs.next()) {
				accountDTO = new AccountDTO();
				accountDTO.setAccountId(rs.getLong("accountId"));
				accountDTO.setAccountName(rs.getString("accountname"));
				accountDTO.setRate(rs.getDouble("rate"));
				accountDTO.setAccountSale(rs.getString("accountsale"));
				
		}else {
			accountDTO = null;
		}
		
		
		rs.close();
		st.close();
		con.close();
		
		return accountDTO;
		
	}
	
	public int setWrite(AccountDTO accountDTO) throws Exception {
		
		String user="user01";
		String password="user01";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
	
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql="insert into account values(BANK_SEQ.nextval,?,?,?) ";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, accountDTO.getAccountName());
		st.setDouble(2, accountDTO.getRate());
		st.setString(3, accountDTO.getAccountSale());
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
		
		
		
	}
	
	
	
	
	
}
