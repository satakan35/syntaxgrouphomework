package javagrouphomework;

public class GroupHM6 {

	public static void main(String[] args) {
		//group made>> Write a java program to check whether a given number is prime or not?

		int num = 29;
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) //PRIME NUMBERS START FROM 2 -3 -- 
	    	{
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
		
		
		
		
		
		
		
		
	}

}
