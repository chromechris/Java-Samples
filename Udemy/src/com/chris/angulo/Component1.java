package com.chris.angulo;

public class Component1 {
	
	//How can I call "Component2 component2v1 = new Component2();" which is in
	//instantiated in "Application" in this class
	
	//private int internalCode = 958745;
	private int finalCode;
	private int comp2code1;
	private int comp2code2;
	private int comp2code3;
	
	public Component1() {
		System.out.print("Initializing Applcation From Component1\n");
	}
	
	public void setCom2Codes(int code1, int code2, int code3) {
		this.comp2code1 = code1;
		this.comp2code2 = code2;
		this.comp2code3 = code3;
	}
	
	public int genFinalCode() {
		finalCode = comp2code1 * comp2code2 * comp2code3;
		return finalCode;
	}
	
}
