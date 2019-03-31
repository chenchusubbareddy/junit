package com.chenchu.spring5Example;

public class Student {

	private int sid;
	private String stdName;
	private double studFee;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public double getStudFee() {
		return studFee;
	}
	public void setStudFee(double studFee) {
		this.studFee = studFee;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", stdName=" + stdName + ", studFee=" + studFee + "]";
	}
	public Student(int sid, String stdName, double studFee) {
		super();
		this.sid = sid;
		this.stdName = stdName;
		this.studFee = studFee;
	}

}
