/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int h = sc.nextInt();

		boolean number1 = r != h;
		
		if(number1 == true){
			System.out.println("They are not equal");
		
		}

		if(number1 == false){
			System.out.println("They are equal");
		
		}
	}
}

