/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely."); 
		Scanner sc = new Scanner (System.in);
		System.out.println(" Please enter an integer: ");
		int int1 = sc.nextInt();
		System.out.println("Please enter another integer thats bigger that the one you just entered: ");
		int int2 = sc.nextInt();
		
		System.out.println("The range is " + int1 + " to " + int2);

		int Random1 = (int)(Math.random()*(int2-int1)+int1);
		int Random2 = (int)(Math.random()*(int2-int1)+int1);
		int Random3 = (int)(Math.random()*(int2-int1)+int1);
		int Random4 = (int)(Math.random()*(int2-int1)+int1);
		int Random5 = (int)(Math.random()*(int2-int1)+int1);

		System.out.println("Here are 5 numbers generaed in that range: " + Random1 + ", " + Random2 + ", " + Random3 + ", " + Random4 + ", " + Random5);

	}
}
