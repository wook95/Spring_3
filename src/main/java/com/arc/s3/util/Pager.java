package com.arc.s3.util;

public class Pager {

	
	private long curPage;
	
	private long startRow;
	private long lastRow;
	
//	private long totalPage; -->startnum , lastnum 기준으로 찍을거여서 지워줌 !
	
	
	private long startNum;
	private long lastNum;

	
	private boolean pre; // 이전 블럭 있으면 true
	private boolean next; // 다음 블럭이 있으면 true
	
	private String kind;	//검색할 컬럼명
	private String search;  //검색할 내용
	
	
	
	
	// ---------------------------set, get
	
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


	public long getCurPage() {
		
		if(this.curPage<1) this.curPage=1;
		
		
		return curPage;
	}


	public void setCurPage(long curPage) {
		if (curPage<1) curPage=1;
		
		
		this.curPage = curPage;
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
	


}
