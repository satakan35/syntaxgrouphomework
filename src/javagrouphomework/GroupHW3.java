package javagrouphomework;

public class GroupHW3 {

	public static void main(String[] args) {
		//Stephanie>> Create a 2D array of integer values. Print the sum of all numbers
		
		
		int sum=0;
		int[] numbers = {10,25,75,45,8};
		for (int i=0; i <numbers.length; i++) {
			sum=sum+numbers[i];
		}
		System.out.println("The sum of the array "+sum);
	}

}
