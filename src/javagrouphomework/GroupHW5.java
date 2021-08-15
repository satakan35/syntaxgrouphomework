package javagrouphomework;

public class GroupHW5 {

	public static void main(String[] args) {
		// Monique >>Create a 2D array or integer type where you will store odd and even numbers. 
		//Develop a program which will identify/print the even numbers only. 

		int array[][]= {
				{2,4,6,8,10},
				{1,3,5,7,9},
		};
		
		System.out.println("Even Numbers");
		for(int i=0;i<array.length;i++) {
			int value = array[i][0]; // col 0 means first column
		  if (value % 2 == 0) {
		   System.out.println(array[i][0]);
		  }
		}
		for(int i=0;i<array.length;i++) {
			int value = array[i][1]; // col 0 means first column
		  if (value % 2 == 0) {
		   System.out.println(array[i][1]);
		  }
		}
		for(int i=0;i<array.length;i++) {
			int value = array[i][2]; // col 0 means first column
		  if (value % 2 == 0) {
		   System.out.println(array[i][2]);
		  }
		}
		for(int i=0;i<array.length;i++) {
			int value = array[i][3]; // col 0 means first column
		  if (value % 2 == 0) {
		   System.out.println(array[i][3]);
		  }
		}
		// Let's traverse the second column.
		for (int i = 0; i <array.length; i++) {
		  int value = array[i][4]; 
		  if (value % 2 == 0) {
			   System.out.println(array[i][4]);// col 1 means second column
		  }
		}
	        
	     
		
		
	        
	    }
	
	  }
		
		
	
		
		
	
		
	
