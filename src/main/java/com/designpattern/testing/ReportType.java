package com.designpattern.testing;

public enum ReportType {
    
	COLI(1,"COLI"),
	MUTUAL_FUND(2,"MUTUAL FUND");
	
	private int code;
	private String text;
	
	private ReportType(int code, String text){
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