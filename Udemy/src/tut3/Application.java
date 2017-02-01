package tut3;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

	private int over9 = 9000;
	private String over = "Over ";
	private String over9000 = over + over9;
	private double myDouble = 8.0010;
	boolean flag1 = true;
	private String num1 = "ABC";
	private String num2 = "ABC";
	private String num3 = new String("ABC");
	private String num4 = num3;
	private int five = 5;
	private int zero = 0;
	private int temp = 0;
	private boolean cond;
	private double anotherDouble;
	private int scratchInt;
	private int backupScratchInt;
	private String scratchString;
	private boolean scratchBool;
	//
	private String line;
	private int myInteger;
	//
	private int[] myIntArray;
	private String[] myStringArray;
	private String text;
	
	public void stringArrays() {
		myStringArray = new String[3];
		myStringArray[0] = "Optimus";
		myStringArray[1] = "Flight";
		myStringArray[2] = "Recordance";
		
		for(String word: myStringArray) {
			System.out.println(word);
		}
		
		text = null;
		System.out.println(text);//lol
	}
	
	
	public void playingArrays() {
		myIntArray = new int[10];
		myIntArray[0] = 34;
		for(int i=1;i<myIntArray.length;i++) {
			myIntArray[i]=(i*3);
		}
		System.out.println("\n" + myIntArray[0]);
		System.out.println("\n" + myIntArray[1]);
		System.out.println("\n" + myIntArray[2]);
		System.out.println("\n" + myIntArray[3]);
		System.out.println("\n" + myIntArray[4]);
		System.out.println("\n" + myIntArray[5]);
		System.out.println("\n" + myIntArray[6]);
		System.out.println("\n" + myIntArray[7]);
		System.out.println("\n" + myIntArray[9]);
	}
	
	
	public void loopIt() {
		while (flag1 == true) {
			System.out.println(flag1); // Should only print out once
			flag1 = false;
		}

		while (five >= zero) {
			temp++;
			System.out.println("Iteration " + temp);
			zero++;
		}

		for (int i = 1; i < 5; i += 1) { // Should iterate 4 times
			// System.out.println("For-Loop-Iteration: " + i);
			System.out.printf("Variable i is: %.1f\n", 10.254);
		}

	}

	public void siNo() {
		if (num3 == num4) {
			System.out
					.println("Variable references point to the same memory Location");
		} else {
			System.out
					.println("Variable references DO NOT point to the same memory Location");
		}

		if (num1.equals(num3)) {
			System.out
					.println("Variable references contain the same contents (Character Sequence) ");
		} else {
			System.out
					.println("Variable references DO NOT point to the same memory Location");
		}
	}

	public boolean condition(boolean cond) {
		this.cond = cond;
		return cond;
	}

	public void loopIt2(int num) {
		while (num > 5) {
			System.out.println(num + " is more than 5");
			if (num == 6) {
				System.out.println("Num equal to " + num
						+ ". Breaking Off while-loop");
				break;
			}
			num--;
		}
	}

	// Void Method that takes in one argument
	public void getUserInput(String line) {
		// Global line variable equal to method argument
		this.line = line;
		// Concatenate arbitrary String to "line" String variable
		line = line + "  : Added this String to line";
		// Send value of "line" String variable to the console
		System.out.println(line);
	}

	public int getUserIntInput(int inputedInt) {
		this.myInteger = (inputedInt * 5);
		System.out.println("Your inputed integer " + "'" + inputedInt + "'"
				+ " times 5 is equal to " + myInteger);
		return myInteger;
	}

	public double getUserDoubleInput(double myDouble) {
		this.anotherDouble = myDouble;
		System.out.println("The floating point number you entered is: "
				+ anotherDouble);
		return anotherDouble;
	}

	public String switchStatement(int myInt) {

		return "";
	}

	public static void main(String[] args) {
		Application app1 = new Application();
		System.out.println(app1.over9000);
		System.out.println(app1.myDouble);
		DecimalFormat df = new DecimalFormat("#.######");
		System.out.println(df.format(app1.myDouble));
		app1.siNo();
		app1.loopIt();
		System.out.println(app1.condition(3 == 3));
		app1.loopIt2(10);
		// /////
		// Declare Scanner class Object
		Scanner scan;
		// Output Arbitrary Statement to console
		// System.out.println("Please enter a String");
		// Instantiate Scanner class Object
		scan = new Scanner(System.in);
		// Get Console input
		// app1.line = scan.nextLine();
		// //Send Console input as an argument to .getUserInput void Method
		// app1.getUserInput(app1.line);
		// ////////
		// //Output Arbitrary Statement to console
		// System.out.println("Please enter an integer");
		// //Prompt console for input (Specifically an integer)
		// try {
		// app1.myInteger = scan.nextInt();
		// } catch(InputMismatchException err) {
		// err.printStackTrace();
		// System.out.println("If your result is 0 and you did not input it, it is because you inputed "
		// +
		// "another character rather than an integer, and the value of those characters defaulted to a "
		// +
		// "value of " + app1.myInteger + " for the integer");
		// }
		// //
		// app1.getUserIntInput(app1.myInteger);
		// //
		// //
		// System.out.println("Please enter a floating point number (Decimal Number)");
		// try {
		// app1.anotherDouble = scan.nextDouble();
		// } catch(InputMismatchException err) {
		// err.printStackTrace();
		// System.out.println("If your result is 0.0 and you did not input it, it is because you inputed "
		// +
		// "another character rather than a floating point value, and the value of those characters defaulted to a "
		// +
		// "value of " + app1.anotherDouble + " for the floating point value");
		//
		// }
		// app1.getUserDoubleInput(app1.anotherDouble);
		//
		//

		// Nasty Way
		/*
		 * System.out.println("Please enter a number"); app1.myInteger =
		 * scan.nextInt(); while(app1.myInteger!=9001) {
		 * System.out.println("Please enter a number"); app1.myInteger =
		 * scan.nextInt(); }
		 */

		// Clean Way //Integer.class.isInstance(app1.myInteger)==false
		// do {
		// try {
		// System.out.println("Please enter a number");
		// app1.myInteger = scan.nextInt();
		// } catch (InputMismatchException err) {
		// err.printStackTrace();
		// System.out.println("You did not input an integer to the console");
		// if (err.equals(true)) { //Infinte Loop.
		// break;
		// }
		// }
		// } while (app1.myInteger != 9001);
		// if (app1.myInteger == 9001) {
		// System.out.println("You inputed " + app1.myInteger);
		// }
		// //
		//
		//
		//
		//

		// ///////////////////////////////////////////////////////////////////////////////////////////////////////////
		// ///////////////////////////////////////////////////////////////////////////////////////////////////////////
		// ///////////////////////////////////////////////////////////////////////////////////////////////////////////
		// app1.cond=true;
		// while (app1.cond==true) {
		// app1.scratchBool=true;
		// System.out.println("Please enter a numeric command specified in Instruction Manual");
		// app1.scratchString = scan.nextLine();
		// try {
		// app1.scratchInt = Integer.parseInt(app1.scratchString);
		// System.out.println("You entered: " + app1.scratchInt);
		// } catch (NumberFormatException err) {
		// //err.printStackTrace();
		// System.out.println("You did not enter a number, please try again");
		// app1.scratchBool=false;
		// }
		// if(app1.scratchBool==true) {
		// break;
		// }
		// }
		// ///////////////////////////////////////////////////////////////////////////////////////////////////////////
		// ///////////////////////////////////////////////////////////////////////////////////////////////////////////
		// ///////////////////////////////////////////////////////////////////////////////////////////////////////////

//		System.out.println("Please eneter a Machine command");
//		app1.scratchString = scan.nextLine();
//
//		app1.scratchBool = true;
//		while (app1.scratchBool == true) {
//			if (!(app1.scratchString.equals("start") || app1.scratchString
//					.equals("lock"))) {
//				System.out.println("You can only lock or start the machine");
//				app1.scratchString = scan.nextLine();
//				app1.scratchBool = true;
//			} else {
//				switch (app1.scratchString) {
//				case "start":
//					System.out.println("Machine Started");
//					app1.scratchBool = false;
//					break;
//				case "lock":
//					System.out.println("Machine Locked");
//					app1.scratchBool = false;
//					break;
//				}
//			}
//		}
		
		app1.playingArrays();
		app1.stringArrays();
		
		
	} // End of Main Method
}
