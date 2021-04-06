package com.arc.s3.util;

public class Pager {
	
	
	//db에서 일정 갯수만큼 조회
	//jsp페이지에 일정한 갯수 만큼 번호를 curpage 번호 출력
	
	private long perPage; //DB에서 조회할 갯수,		한 페이지 당 글 갯수
	private long perBlock; // jsp에 몇개씩 번호를 출력할건가, 페이지 당 밑 번호 몇개까지
	
	public Pager() {
		
		this.perPage = 12;
		this.perBlock = 5;
		this.curPage=1;	// 안오면 기본값 
	}
	
	private long curPage;	//현재 머무는 페이지 번호
	
	private long startRow;
	private long lastRow;
	
	//rownum 계산 메서드				-한 페이지에 줄 몇개?
	public void makeRow() {
		
		this.startRow = perPage*(curPage-1)+1;
		this.lastRow = curPage * perPage;
	}
	
	
	
	private long totalPage;
	private long startNum;
	private long lastNum;
	private boolean pre = false;
	private boolean next = false;
	
	private String kind;	//검색할 컬럼명
	private String search;  //검색할 내용
	
	
	//페이징 계산하는 메서드		-- 페이지 밑 번호
	public void makeNum(long totalCount) {
		
		//1. 전체 글의 갯수로 전체 페이지 갯수 구하기
		this.totalPage = totalCount/this.perPage;
		if(totalCount%this.perPage !=0) {
			this.totalPage++;
		}
		
		//2, 총 블록 수 구하기
		
		long totalBlock = totalPage/perBlock;
		if(totalBlock%this.perBlock !=0) {
			totalBlock++;
		}
		
		//3. 현재 블록 번호 구하기
		
	
		
		long curBlock = this.curPage / this.perBlock;
		if(curPage % perBlock != 0) {
			curBlock++;
		}
	
		
		//4. startnum, lastNum 구하기
		this.startNum = perBlock*(curBlock-1)+1;
		this.lastNum =curBlock*perBlock;
	
		//5. 마지막 블럭 처리
		if(curBlock== totalBlock) {
			this.lastNum= totalPage;
		}
		
		//6. 이전, 다음 유무
		
		if(curBlock > 1) {
			pre = true;
		}
		if(curBlock != totalBlock) {
			next = true;
		}
		
		
		
	}


	public long getPerPage() {
		return perPage;
	}


	public void setPerPage(long perPage) {
		this.perPage = perPage;
	}


	public long getPerBlock() {
		return perBlock;
	}


	public void setPerBlock(long perBlock) {
		this.perBlock = perBlock;
	}


	public long getCurPage() {
		
		if(this.curPage<1) this.curPage=1;
		
		
		return curPage;
	}


	public void setCurPage(long curPage) {
		if (curPage<1) curPage=1;
		
		
		this.curPage = curPage;
	}


	public long getStartRow() {
		return startRow;
	}


	public void setStartRow(long startRow) {
		this.startRow = startRow;
	}


	public long getLastRow() {
		return lastRow;
	}


	public void setLastRow(long lastRow) {
		this.lastRow = lastRow;
	}


	public long getTotalPage() {
		return totalPage;
	}


	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}


	public long getStartNum() {
		return startNum;
	}


	public void setStartNum(long startNum) {
		this.startNum = startNum;
	}


	public long getLastNum() {
		return lastNum;
	}


	public void setLastNum(long lastNum) {
		this.lastNum = lastNum;
	}


	public boolean isPre() {
		return pre;
	}


	public void setPre(boolean pre) {
		this.pre = pre;
	}


	public boolean isNext() {
		return next;
	}


	public void setNext(boolean next) {
		this.next = next;
	}


	public String getKind() {
		return kind;
	}


	public void setKind(String kind) {
		this.kind = kind;
	}


	public String getSearch() {
		if(this.search==null) {
			this.search="";
		}
		return search;
	}


	public void setSearch(String search) {
		if(search==null)
		search="";
		this.search = search;
	}

	
	
	
	
	
}
