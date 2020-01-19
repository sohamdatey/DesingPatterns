package com.designpattern.testing;

public enum OutputReportType {

	PDF(1,"COLI"),
	EXCEL(2,"MUTUAL FUND");
	
	private int code;
	private String text;
	
	private OutputReportType(int code, String text){
		this.code=code;
		this.text=text;
	}
	public int getCode(){
		return this.code;
	}
	
	public String getText(){
		return this.text;
	}
}
