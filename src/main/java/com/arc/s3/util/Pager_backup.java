package com.arc.s3.util;

public class Pager_backup {

	
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
	
	
	private int perPage = 12; // 페이지당 보여줄 게시물의 갯수
	private int perBlock = 5; // 한번에 보여줄 숫자의 갯수


	public void makeRow() {
		
		long startRow = (this.getCurPage()-1) * perPage +1;
		long lastRow = this.getCurPage()*perPage;
		this.curPage=1;	// 안오면 기본값 
		
		this.setStartRow(startRow);
		this.setLastRow(lastRow);
		
	}
	
	
	
	public void makeNum(long totalCount) {
		
		//	2. totlaPage  //마지막 페이지 (밑에 써질 번호)
		long totalPage = totalCount / perPage;		//9.5
		if(totalCount%perPage != 0) {
			totalPage++;
		}
		
		
		
		//	3. totalBlock (페이지 밑에 있는 번호들의 집합인데 그중 끝)
		
//		long totalBlock = (long)Math.ceil((double)totalPage/perBlock);
		long totalBlock = totalPage/perBlock;
		if(totalPage%perBlock != 0) {
			totalBlock++;
		}
	
		// 4. curblock
		
		long curBlock = (this.getCurPage() / perBlock);
		if (this.getCurPage() % perBlock !=0)curBlock++;
		
	
		
		
		//5. startNum, lastNum --> 둘다 jsp 로 보내줘야 ,,
		
		long startNum= (curBlock-1)*perBlock+1;
		long lastNum = curBlock*perBlock;
		
		//6. 마지막 블럭의 마지막번호에서 끝나고 싶을떄 ,,
		// curBlock이 마지막 block (total block)
		
		if(curBlock==totalBlock) {
			lastNum = totalPage;
		}
		
		
		
		
		//7. 이전, 다음 block 존재 여부
		
		//이전
		if(curBlock != 1) {
			this.setPre(true);
		}
		//다음
		if(curBlock != totalBlock) {
			this.setNext(true);
		}
		
		
		
		this.setStartNum(startNum);
		this.setLastNum(lastNum);
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
