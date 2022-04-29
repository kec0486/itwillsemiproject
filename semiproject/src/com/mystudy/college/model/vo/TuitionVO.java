package com.mystudy.college.model.vo;

public class TuitionVO {
	private int t_state; //등록금납부상태
	private String t_payment; //결제수단
	
	public int getT_state() {
		return t_state;
	}
	public void setT_state(int t_state) {
		this.t_state = t_state;
	}
	public String getT_payment() {
		return t_payment;
	}
	public void setT_payment(String t_payment) {
		this.t_payment = t_payment;
	}
	@Override
	public String toString() {
		return "TuitionVO [t_state=" + t_state + ", t_payment=" + t_payment + "]";
	}
	
	
}
