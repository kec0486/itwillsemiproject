package com.mystudy.college.model.vo;

public class CustomerVO {
	private int c_id; //학사번호
	private String c_password; //비밀번호
	private String c_name; //성명
	private int c_rrn; //주민등록번호
	private int c_acount; //계좌번호
	private int c_authority; //권한
	private String c_gender; //성별
	private int c_callnumber; //전화번호
	private int c_phone; //휴대폰번호
	private String c_email; //이메일
	private String m_address; //주소
	
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_password() {
		return c_password;
	}
	public void setC_password(String c_password) {
		this.c_password = c_password;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public int getC_rrn() {
		return c_rrn;
	}
	public void setC_rrn(int c_rrn) {
		this.c_rrn = c_rrn;
	}
	public int getC_acount() {
		return c_acount;
	}
	public void setC_acount(int c_acount) {
		this.c_acount = c_acount;
	}
	public int getC_authority() {
		return c_authority;
	}
	public void setC_authority(int c_authority) {
		this.c_authority = c_authority;
	}
	public String getC_gender() {
		return c_gender;
	}
	public void setC_gender(String c_gender) {
		this.c_gender = c_gender;
	}
	public int getC_callnumber() {
		return c_callnumber;
	}
	public void setC_callnumber(int c_callnumber) {
		this.c_callnumber = c_callnumber;
	}
	public int getC_phone() {
		return c_phone;
	}
	public void setC_phone(int c_phone) {
		this.c_phone = c_phone;
	}
	public String getC_email() {
		return c_email;
	}
	public void setC_email(String c_email) {
		this.c_email = c_email;
	}
	public String getM_address() {
		return m_address;
	}
	public void setM_address(String m_address) {
		this.m_address = m_address;
	}
	@Override
	public String toString() {
		return "CustomerVO [c_id=" + c_id + ", c_password=" + c_password + ", c_name=" + c_name + ", c_rrn=" + c_rrn
				+ ", c_acount=" + c_acount + ", c_authority=" + c_authority + ", c_gender=" + c_gender
				+ ", c_callnumber=" + c_callnumber + ", c_phone=" + c_phone + ", c_email=" + c_email + ", m_address="
				+ m_address + "]";
	}
	
	
}
	
	
	
	
