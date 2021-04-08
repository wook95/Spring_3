package com.arc.s3.member;

public class MemberDTO {

	
	//변수명과 데이터타입은 컬럼과 동일하게
	//private, getter,setter, 기본생성자 1개
	
	
	private MemberFileDTO memberFileDTO;
	
	
	private String id;
	private String pw;
	private String name;
	private String phone;
	private String email;
	
	public MemberFileDTO getMemberFileDTO() {
		return memberFileDTO;
	}
	public void setMemberFileDTO(MemberFileDTO memberFileDTO) {
		this.memberFileDTO = memberFileDTO;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
