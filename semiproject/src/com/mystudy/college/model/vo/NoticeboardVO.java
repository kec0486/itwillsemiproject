package com.mystudy.college.model.vo;

import java.sql.Date;

public class NoticeboardVO {
	private int n_num; //게시물번호
	private String n_title; //제목
	private Date n_regdate; //게시일
	private String n_orgfilename; //원본파일이름
	private String n_savefilename; //저장된파일이름
	private int c_id; //학사번호
	
	public int getN_num() {
		return n_num;
	}
	public void setN_num(int n_num) {
		this.n_num = n_num;
	}
	public String getN_title() {
		return n_title;
	}
	public void setN_title(String n_title) {
		this.n_title = n_title;
	}
	public Date getN_regdate() {
		return n_regdate;
	}
	public void setN_regdate(Date n_regdate) {
		this.n_regdate = n_regdate;
	}
	public String getN_orgfilename() {
		return n_orgfilename;
	}
	public void setN_orgfilename(String n_orgfilename) {
		this.n_orgfilename = n_orgfilename;
	}
	public String getN_savefilename() {
		return n_savefilename;
	}
	public void setN_savefilename(String n_savefilename) {
		this.n_savefilename = n_savefilename;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	@Override
	public String toString() {
		return "NoticeboardVO [n_num=" + n_num + ", n_title=" + n_title + ", n_regdate=" + n_regdate
				+ ", n_orgfilename=" + n_orgfilename + ", n_savefilename=" + n_savefilename + ", c_id=" + c_id + "]";
	}
	
	
}
