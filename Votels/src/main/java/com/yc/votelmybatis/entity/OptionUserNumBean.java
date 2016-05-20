package com.yc.votelmybatis.entity;

public class OptionUserNumBean {
	private Subject subject;
	private int optionId;
	
	private int num;
	private int sumNum;
	
	public int getSumNum() {
		return sumNum;
	}
	public void setSumNum(int sumNum) {
		this.sumNum = sumNum;
	}
	public int getOptionId() {
		return optionId;
	}
	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public String getProportion(){
		double n=(double)num/sumNum;
		String result=String.valueOf(n);
		if(result.contains(".") && result.length()>4){
			result=result.substring(result.indexOf(".")+1, result.indexOf(".")+3);
		} else{
			result=String.valueOf(n*100);
		}
		return result;
	}
	
	public String toString() {
		return "OptionUserNumBean [subject=" + subject + ", optionId="
				+ optionId + ", num=" + num + ", sumNum=" + sumNum + "]";
	}
}
