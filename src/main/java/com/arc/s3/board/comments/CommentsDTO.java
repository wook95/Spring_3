package com.arc.s3.board.comments;

import java.sql.Date;

public class CommentsDTO {

	
	private long commentsNum;
	private long num;
	private String writer;
	private String contents;
	private Date regDate;
	
	public long getCommentsNum() {
		return commentsNum;
	}
	public void setCommentsNum(long commentsNum) {
		this.commentsNum = commentsNum;
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
