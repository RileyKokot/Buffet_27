/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely."); 
		Scanner sc = new Scanner(System.in);
		int num1 = (0);
		int num2 = (10);
		System.out.println("Here is a random number between 0 and 9 including both: " + (int)Math.random() * 10);

		int nuM1 = (1);
		int nuM2 = (100);
		System.out.println("Here is a random number between 1 and 100 including both: " +(int)Math.random() * nuM2 + 1);

		System.out.println("Here is a random number between 2.5 and 3.5: "(Math.random() * 1.0) + 2.5);

		System.out.println("Here is a random number between 14 and 589: "(Math.random() * 575) + 14);



		
		

	}
}
