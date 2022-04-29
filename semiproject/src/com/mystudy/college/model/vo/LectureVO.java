package com.mystudy.college.model.vo;

public class LectureVO {
	private int l_id; //수강번호
	private String l_department; //관련학과
	private String l_categorize; //이수구분
	private String l_year; //이수학년
	private String l_semester; //이수학기
	private String l_name; //과목명
	private String l_professor; //교수명
	private int l_credit; //학점
	private int c_id; //학사번호
	
	public int getL_id() {
		return l_id;
	}
	public void setL_id(int l_id) {
		this.l_id = l_id;
	}
	public String getL_department() {
		return l_department;
	}
	public void setL_department(String l_department) {
		this.l_department = l_department;
	}
	public String getL_categorize() {
		return l_categorize;
	}
	public void setL_categorize(String l_categorize) {
		this.l_categorize = l_categorize;
	}
	public String getL_year() {
		return l_year;
	}
	public void setL_year(String l_year) {
		this.l_year = l_year;
	}
	public String getL_semester() {
		return l_semester;
	}
	public void setL_semester(String l_semester) {
		this.l_semester = l_semester;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getL_professor() {
		return l_professor;
	}
	public void setL_professor(String l_professor) {
		this.l_professor = l_professor;
	}
	public int getL_credit() {
		return l_credit;
	}
	public void setL_credit(int l_credit) {
		this.l_credit = l_credit;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	@Override
	public String toString() {
		return "LectureVO [l_id=" + l_id + ", l_department=" + l_department + ", l_categorize=" + l_categorize
				+ ", l_year=" + l_year + ", l_semester=" + l_semester + ", l_name=" + l_name + ", l_professor="
				+ l_professor + ", l_credit=" + l_credit + ", c_id=" + c_id + "]";
	}
	
	
}
