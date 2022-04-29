package com.mystudy.college.model.vo;

import java.sql.Date;

public class BookVO {
	private int b_num; //도서번호
	private String b_name; //도서명
	private String b_author; //저자명
	private String b_translator; //번역자
	private String b_publisher; //출판사
	private Date b_issuedate; //발행연도
	private String b_isbn; //ISBN
	private int b_able; //대출가능여부
	private int c_id; //학사정보
	
	public int getB_num() {
		return b_num;
	}
	public void setB_num(int b_num) {
		this.b_num = b_num;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_author() {
		return b_author;
	}
	public void setB_author(String b_author) {
		this.b_author = b_author;
	}
	public String getB_translator() {
		return b_translator;
	}
	public void setB_translator(String b_translator) {
		this.b_translator = b_translator;
	}
	public String getB_publisher() {
		return b_publisher;
	}
	public void setB_publisher(String b_publisher) {
		this.b_publisher = b_publisher;
	}
	public Date getB_issuedate() {
		return b_issuedate;
	}
	public void setB_issuedate(Date b_issuedate) {
		this.b_issuedate = b_issuedate;
	}
	public String getB_isbn() {
		return b_isbn;
	}
	public void setB_isbn(String b_isbn) {
		this.b_isbn = b_isbn;
	}
	public int getB_able() {
		return b_able;
	}
	public void setB_able(int b_able) {
		this.b_able = b_able;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	@Override
	public String toString() {
		return "BookVO [b_num=" + b_num + ", b_name=" + b_name + ", b_author=" + b_author + ", b_translator="
				+ b_translator + ", b_publisher=" + b_publisher + ", b_issuedate=" + b_issuedate + ", b_isbn=" + b_isbn
				+ ", b_able=" + b_able + ", c_id=" + c_id + "]";
	}
	
	
}
