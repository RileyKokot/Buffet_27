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
		System.out.print("I love to learn coding remotely."); 
		lic static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1 = (int)(Math.random()*1000);
		System.out.println("Please guess a number 0 to 1000");
		int num2 = sc.nextInt();

		if(num1 == num2){
			System.out.println("You are correct! The Number is: " + num1);
		}
		if(num1 > num2){
			
		}
	}
}
