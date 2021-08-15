package javagrouphomework;

public class GroupHW3 {

	public static void main(String[] args) {
		//Stephanie>> Create a 2D array of integer values. Print the sum of all numbers
		
		
		
		int[][] array = {
		{10,25,75,45,8},		
		{1,2,3,4,5}
		};
		System.out.println("no of rows in above 2D array "+array.length);
		int sum=0;
		for (int row=0; row <array.length; row++) {
			
			System.out.println("no of colums in the " +"row"+array[row].length);
			for (int col=0; col < array[row].length; col++) {
				System.out.println("The sum of the array "+array[row][col]);	
				sum=sum+array[row][col];
			}
		}
		System.out.println("Sum "+sum);
	}
}
