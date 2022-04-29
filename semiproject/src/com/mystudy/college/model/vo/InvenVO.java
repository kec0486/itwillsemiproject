package com.mystudy.college.model.vo;

public class InvenVO {
	private int i_num; //재고번호
	private int i_syscount; //원수량
	private int i_rentablecount; //대출가능수량
	private int b_num; //도서번호
	
	public int getI_num() {
		return i_num;
	}
	public void setI_num(int i_num) {
		this.i_num = i_num;
	}
	public int getI_syscount() {
		return i_syscount;
	}
	public void setI_syscount(int i_syscount) {
		this.i_syscount = i_syscount;
	}
	public int getI_rentablecount() {
		return i_rentablecount;
	}
	public void setI_rentablecount(int i_rentablecount) {
		this.i_rentablecount = i_rentablecount;
	}
	public int getB_num() {
		return b_num;
	}
	public void setB_num(int b_num) {
		this.b_num = b_num;
	}
	@Override
	public String toString() {
		return "InvenVO [i_num=" + i_num + ", i_syscount=" + i_syscount + ", i_rentablecount=" + i_rentablecount
				+ ", b_num=" + b_num + "]";
	}
	
	
}
