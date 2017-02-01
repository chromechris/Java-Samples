package com.chris.angulo;
/*
 * Practice
 * Christopher Angulo
 * Tech Recon LLC
 */

import java.util.Scanner;

public class Application { //Driver Application
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// To read user input
		int tempCode;//User will input many things, this variable will represent
		             //each value that the user inputs many times
		
		Application App1 = new Application(); //Instantiate Object 1 of Application
											  //Class
		Component1 component1v1 = new Component1(); //Instantiate Object 1 of 
		                                            //Component1 class
		Component2 component2v1 = new Component2(); //Instantiate Object 1 of 
													//Component2 class

		System.out.println("Please Enter Code 1"); //Prompt for Code 1
		tempCode = scan.nextInt(); //Get User input for code 1
		component2v1.setCode1(tempCode); //Set code 1
		System.out.println("Please Enter Code 2"); //Prompt for Code 2
		tempCode = scan.nextInt(); //Get User input for code 2
		component2v1.setCode2(tempCode); //Set code 2
		System.out.println("Please Enter Code 3"); //Prompt for Code 3
		tempCode = scan.nextInt(); //Get User input for code 3
		component2v1.setCode3(tempCode); //Set code 3
		
		//Sets the code values in Component1 Object for Component2 Object
		component1v1.setCom2Codes(component2v1.getCode1(), component2v1.getCode2(), component2v1.getCode3());
		//component2v1.genActFinCode(component1v1.genFinalCode());
		System.out.println("Final Code: " + component2v1.genActFinCode(component1v1.genFinalCode()));
	}

}
