package com.arc.s3.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arc.s3.util.Pager_backup;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO accountDAO;
	//defendncy가 있네??!
	//넣어주는것, injection
	//DI 해주자 -->오토와이어드
	
	
	
	
	
	
	
	public List<AccountDTO> getList(Pager_backup pager) throws Exception {
		
		
		long totalCount = accountDAO.getTotalCount();
		
		int perPage = 12;
		int perBlock = 5;
		
		//1. 한 페이지에 나올 글 갯수 정해주기
		
		long startRow = (pager.getCurPage()-1)*perPage+1;
		long lastRow = pager.getCurPage()*perPage;
		pager.setStartRow(startRow);
		pager.setLastRow(lastRow);
		
		
		
		//2. 번호 나누기 위해/ 총 페이지 몇인가 계산
		
		long totalPage = totalCount/perPage;
		if(totalCount%perPage != 0) {totalPage++;}
		
		
		
		//3 총 블록 블록 몇개?
		
		long totalBlock = totalPage/perBlock;
		if(totalPage%perBlock != 0) {
			totalBlock++;
		}
		
		//4 현재 블록 어디?
		long curBlock = pager.getCurPage()/perBlock;
		if(pager.getCurPage()%perBlock !=0) {curBlock++;}
		
		
		//5. 블록 시작과 끝
		long startNum = perBlock*(curBlock-1)+1;
		long lastNum = curBlock*perBlock;
		
		//6. 블록의 끝이 마지막 페이지와 동일하게 맞춰주기
		if(curBlock==totalBlock) lastNum=totalPage;
		
		//7. next와 pre 설정/ pager에 boolean 선언
		
		if(curBlock!=1){
			pager.setPre(true);
		}
		if(curBlock!=totalBlock) {
			pager.setNext(true);
		}
		
		
		pager.setStartNum(startNum);
		pager.setLastNum(lastNum);
		
		
		
		return accountDAO.getList(pager);
	}
	
	
	public AccountDTO getSelect(AccountDTO accountDTO) throws Exception {
		
		
		return accountDAO.getSelect(accountDTO);
	}
	
	
	public int setDelte(AccountDTO accountDTO) throws Exception {
	
	return accountDAO.setDelete(accountDTO);
	}
	
	public int setUpdate(AccountDTO accountDTO) throws Exception{
		
		return accountDAO.setUpdate(accountDTO);		
	}
	
	
	
}
