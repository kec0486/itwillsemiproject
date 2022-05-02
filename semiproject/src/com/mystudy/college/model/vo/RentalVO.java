package com.mystudy.college.model.vo;

import java.sql.Date;

public class RentalVO {
	private int r_num; //대출번호
	private int r_able; //대출상태
	private Date r_rentable; //대출일자
	private Date r_return; //반납예정일
	private int r_delay; //연장여부 
	private int b_num; //도서번호
	
	public int getR_num() {
		return r_num;
	}
	public void setR_num(int r_num) {
		this.r_num = r_num;
	}
	public int getR_able() {
		return r_able;
	}
	public void setR_able(int r_able) {
		this.r_able = r_able;
	}
	public Date getR_rentable() {
		return r_rentable;
	}
	public void setR_rentable(Date r_rentable) {
		this.r_rentable = r_rentable;
	}
	public Date getR_return() {
		return r_return;
	}
	public void setR_return(Date r_return) {
		this.r_return = r_return;
	}
	public int getR_delay() {
		return r_delay;
	}
	public void setR_delay(int r_delay) {
		this.r_delay = r_delay;
	}
	public int getB_num() {
		return b_num;
	}
	public void setB_num(int b_num) {
		this.b_num = b_num;
	}
	@Override
	public String toString() {
		return "RentalVO [r_num=" + r_num + ", r_able=" + r_able + ", r_rentable=" + r_rentable + ", r_return="
				+ r_return + ", r_delay=" + r_delay + ", b_num=" + b_num + "]";
	}
	
	
}
