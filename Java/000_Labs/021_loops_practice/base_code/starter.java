/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Please guess a number between 1 and 1000: ");
		// int num = sc.nextInt();
		int lala = (int)(Math.random()*999)+1;
		System.out.println("Please guess a number between 1 and 1000: ");
		while(true){
		
		int num = sc.nextInt();

		
		if(num >= lala){
			System.out.println("Your number is higher. Guess again");
			num = sc.nextInt();
		}
			else if(num <= lala){
				System.out.println("Your number is lower. Guess again");
				num = sc.nextInt();
			}
				else if(num == lala){
					System.out.println("You guessed it!");
					break;
				}
				
				
		



		
	}
	}
}
