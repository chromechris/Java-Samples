package tut4;

public class Application {
	private String[][] texts = { //Creates String literals
			{"eyy"},{"bay"},{"bai"}
		};
	
	private String[][] hilos = new String [1][2]; //Creates a new String Object, not recommended
	
	
	public void arraysPractice() {
		int[] intArray = {1,2,3,5,8}; //Single Dimensional Array
		for(int i=0;i<intArray.length;i++) {
			//System.out.println(intArray[i]);
		}
		
		int[][] multiDimArray = { //Multi-Dimesnional Array
				{1,4,6},{45,65,235},{354,8,45564,54,54,},{4},{45,87,98,9,3,1,6,5} //5 Sets
		};
		//System.out.println(multiDimArray[2][3]); //Displaying an actual value in a multi-dimensional
		//array
		for(int i=0;i<multiDimArray.length;i++) {
			System.out.println("\n\nTwo-Dim Arary Set: " + i);
			for(int i2=0;i2<multiDimArray[i].length;i2++) {
				System.out.print(multiDimArray[i][i2] + "\t");
			}
		}
		
		
		hilos[0][1] = "Hello World";
		System.out.println(hilos[0][1]); //Not printing in a new line
		
		
	}
	
	public static void main(String[] args) {
		//Application app1 = new Application();
		//app1.arraysPractice();
		
		
		
		
	}

}
