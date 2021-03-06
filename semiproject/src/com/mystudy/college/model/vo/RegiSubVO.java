package com.mystudy.college.model.vo;

public class RegiSubVO {
	private String re_term; // 학기 
	private int re_score; //점수 
	private String re_grade; // 성적 
	private int sub_code; //과목코드 
	private int st_id; //학번 
	
	private String sub_name; //과목명 
	private int sub_level; // 학년 
	private int sub_credit; //학점 
	private String sub_day; //강의 요일 
	private String sub_time; // 강의 시간 
	private String sub_class; //강의실 
	
	public RegiSubVO(String re_term, int re_score, String re_grade, int sub_code, int st_id, String sub_name,
			int sub_level, int sub_credit, String sub_day, String sub_time, String sub_class) {
		super();
		this.re_term = re_term;
		this.re_score = re_score;
		this.re_grade = re_grade;
		this.sub_code = sub_code;
		this.st_id = st_id;
		this.sub_name = sub_name;
		this.sub_level = sub_level;
		this.sub_credit = sub_credit;
		this.sub_day = sub_day;
		this.sub_time = sub_time;
		this.sub_class = sub_class;
	}

	public String getRe_term() {
		return re_term;
	}

	public void setRe_term(String re_term) {
		this.re_term = re_term;
	}

	public int getRe_score() {
		return re_score;
	}

	public void setRe_score(int re_score) {
		this.re_score = re_score;
	}

	public String getRe_grade() {
		return re_grade;
	}

	public void setRe_grade(String re_grade) {
		this.re_grade = re_grade;
	}

	public int getSub_code() {
		return sub_code;
	}

	public void setSub_code(int sub_code) {
		this.sub_code = sub_code;
	}

	public int getSt_id() {
		return st_id;
	}

	public void setSt_id(int st_id) {
		this.st_id = st_id;
	}

	public String getSub_name() {
		return sub_name;
	}

	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}

	public int getSub_level() {
		return sub_level;
	}

	public void setSub_level(int sub_level) {
		this.sub_level = sub_level;
	}

	public int getSub_credit() {
		return sub_credit;
	}

	public void setSub_credit(int sub_credit) {
		this.sub_credit = sub_credit;
	}

	public String getSub_day() {
		return sub_day;
	}

	public void setSub_day(String sub_day) {
		this.sub_day = sub_day;
	}

	public String getSub_time() {
		return sub_time;
	}

	public void setSub_time(String sub_time) {
		this.sub_time = sub_time;
	}

	public String getSub_class() {
		return sub_class;
	}

	public void setSub_class(String sub_class) {
		this.sub_class = sub_class;
	}

	@Override
	public String toString() {
		return "RegiSubVO [re_term=" + re_term + ", re_score=" + re_score + ", re_grade=" + re_grade + ", sub_code="
				+ sub_code + ", st_id=" + st_id + ", sub_name=" + sub_name + ", sub_level=" + sub_level
				+ ", sub_credit=" + sub_credit + ", sub_day=" + sub_day + ", sub_time=" + sub_time + ", sub_class="
				+ sub_class + "]";
	}
	
	
	
}
