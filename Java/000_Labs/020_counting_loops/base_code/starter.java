/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your name: ");
		String name = sc.nextLine();

		System.out.println("How many times would you like to print your name: ");
		int name2 = sc.nextInt();
		int x = 0;
	

		if(name2 == 0){
			System.out.println("So u dont wanna print ur name? Thats lame");

		}
		while(true){
			if(x == name2){
				break;
			}
			System.out.println(name);
			x++;
		}




		
	}
}
