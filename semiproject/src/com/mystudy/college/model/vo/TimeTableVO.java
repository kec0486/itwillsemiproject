package com.mystudy.college.model.vo;

public class TimeTableVO {

	private int t_id; //강의 시간표 조회용 아이디 
	private int t_day; // 강의 날짜 
	private int t_time; // 강의 시간 
	private int l_id; //수강번호
	
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public int getT_day() {
		return t_day;
	}
	public void setT_day(int t_day) {
		this.t_day = t_day;
	}
	public int getT_time() {
		return t_time;
	}
	public void setT_time(int t_time) {
		this.t_time = t_time;
	}
	public int getL_id() {
		return l_id;
	}
	public void setL_id(int l_id) {
		this.l_id = l_id;
	}
	
	@Override
	public String toString() {
		return "TimeTableVO [t_id=" + t_id + ", t_day=" + t_day + ", t_time=" + t_time + ", l_id=" + l_id + "]";
	}
	
	
	
	
	
	
}
