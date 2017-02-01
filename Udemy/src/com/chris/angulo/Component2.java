package com.chris.angulo;

public class Component2 {
	
	private int code1;
	private int code2;
	private int code3;
	private int Component2GenCode;
	private int internalCode = 9001;
	private int actualFinalCode;
	
	public void setCode1(int code1) { //Set Code 1
		this.code1 = code1;
	}
	
	public int getCode1() {     //Get Code 1
		return code1;
	}
	
	public void setCode2(int code2) { //Set code 2
		this.code2 = code2;
	}
	
	public int getCode2() { //Get Code 2
		return code2;
	}
	
	public void setCode3(int code3) { //Set code 3
		this.code3 = code3;
	}
	
	public int getCode3() { //Get Code 3
		return code3;
	}
	
	public int genActFinCode(int finalCode) {
		this.actualFinalCode = (finalCode * internalCode);
		return actualFinalCode;
	}
	
}
