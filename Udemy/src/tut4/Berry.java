package tut4;

import java.util.Scanner;

public class Berry {
	
	public static void main(String[] args) {
		//System Input Software by creating Scanner object(s) in methods within the instantiated class
//		RobotBoi robotBoi1 = new RobotBoi();
//		robotBoi1.userInterface();
//		System.out.println(robotBoi1.returnChoice());
//		System.out.println("The public robot model number is: " + robotBoi1.robotModel + "\nPlease save this robot model number for support inquries");
		
		//System Input Software by creating Scanner object(s) inside main method, where class is instantiated, and values obtained by Scanner are passed to the arguments of the instantiated class constructors
		Scanner scan = new Scanner(System.in);
		int robotModel=1598563;
		int numOfRobots;
		String colorOfRobots;
		
		System.out.println("Please enter the number of Robots");
		numOfRobots = Integer.parseInt(scan.nextLine()); //Assigns number of Robots as int type
		System.out.println("Please enter the color of the Robot");
		colorOfRobots = scan.nextLine(); //Assigns color of Robots as String type
		RobotBoi robotBoi2 = new RobotBoi(robotModel,numOfRobots,colorOfRobots);
		System.out.println(robotBoi2.toString());
	}
}

class RobotBoi {
	private int numOfRobots;
	private String colorOfRobots;
	public int robotModel=1598563;
	private Scanner scan = new Scanner(System.in);
	
	public void userInterface() {//1st Method
		System.out.println("Please enter the number of Robots");
		numOfRobots = Integer.parseInt(scan.nextLine()); //Assigns number of Robots as int type
		System.out.println("Please enter the color of the Robot");
		colorOfRobots = scan.nextLine(); //Assigns color of Robots as String type
	}
	
	public String returnChoice() { //2nd Method //Return choice again, whenever you want
		return "You picked " + numOfRobots + " robots of color " +colorOfRobots;
	}
	
	public RobotBoi() {
		//Default Constructor
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
	public RobotBoi(int robotModel,int numOfRobots, String colorOfRobots) {
		this.robotModel = robotModel;
		this.numOfRobots = numOfRobots;
		this.colorOfRobots = colorOfRobots;
	}
	
	public String toString() {
		return "You picked " + numOfRobots + " robots of color " + colorOfRobots + "\nThe public robot model number is: " + robotModel + "\nPlease save this robot model number for support inquries";
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
}

//Ask about best practice