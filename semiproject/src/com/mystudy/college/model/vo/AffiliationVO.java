package com.mystudy.college.model.vo;

import java.sql.Date;

public class AffiliationVO {
	private int a_num; //소속번호
	private Date a_admissiondate; //입학날짜
	private Date a_graduationdate; //졸업일자
	private String a_college; //단과대학
	private String a_major; //주전공(학과)
	private String a_secondmajor; //제2전공
	private String a_dualmajor; //부전공
	private int a_grade; //학년
	private String a_state; //학적상태
	private int c_id; //학사번호
	
	public int getA_num() {
		return a_num;
	}
	public void setA_num(int a_num) {
		this.a_num = a_num;
	}
	public Date getA_admissiondate() {
		return a_admissiondate;
	}
	public void setA_admissiondate(Date a_admissiondate) {
		this.a_admissiondate = a_admissiondate;
	}
	public Date getA_graduationdate() {
		return a_graduationdate;
	}
	public void setA_graduationdate(Date a_graduationdate) {
		this.a_graduationdate = a_graduationdate;
	}
	public String getA_college() {
		return a_college;
	}
	public void setA_college(String a_college) {
		this.a_college = a_college;
	}
	public String getA_major() {
		return a_major;
	}
	public void setA_major(String a_major) {
		this.a_major = a_major;
	}
	public String getA_secondmajor() {
		return a_secondmajor;
	}
	public void setA_secondmajor(String a_secondmajor) {
		this.a_secondmajor = a_secondmajor;
	}
	public String getA_dualmajor() {
		return a_dualmajor;
	}
	public void setA_dualmajor(String a_dualmajor) {
		this.a_dualmajor = a_dualmajor;
	}
	public int getA_grade() {
		return a_grade;
	}
	public void setA_grade(int a_grade) {
		this.a_grade = a_grade;
	}
	public String getA_state() {
		return a_state;
	}
	public void setA_state(String a_state) {
		this.a_state = a_state;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	@Override
	public String toString() {
		return "AffiliationVO [a_num=" + a_num + ", a_admissiondate=" + a_admissiondate + ", a_graduationdate="
				+ a_graduationdate + ", a_college=" + a_college + ", a_major=" + a_major + ", a_secondmajor="
				+ a_secondmajor + ", a_dualmajor=" + a_dualmajor + ", a_grade=" + a_grade + ", a_state=" + a_state
				+ ", c_id=" + c_id + "]";
	}
	
	
}
