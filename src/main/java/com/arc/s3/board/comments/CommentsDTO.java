package com.arc.s3.board.comments;

import java.sql.Date;

public class CommentsDTO {

	
	private long commnetsNum;
	private long num;
	private String writer;
	private String contents;
	private Date regDate;
	public long getCommnetsNum() {
		return commnetsNum;
	}
	public void setCommnetsNum(long commnetsNum) {
		this.commnetsNum = commnetsNum;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
	
	
	
	
}
