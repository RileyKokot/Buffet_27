/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely."); 
		 Scanner sc = new Scanner(System.in);

        System.out.print("What is your first name? ");
        String firstName = sc.nextLine();

        System.out.print("How old are you? ");
        int age = sc.nextInt();

        System.out.print("What month were you born? ");
        String birthdayMonth = sc.next();

        System.out.print("What day were you born? ");
        int birthdayDay = sc.nextInt();

        System.out.print("What year were you born? ");
        int birthdayYear = sc.nextInt();

        System.out.print("How much is a buck fifty? ");
        double buckFifty = sc.nextDouble();

        System.out.println();
        System.out.println("Your name is " + firstName + ".");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your birthday is " + birthdayMonth + " " 
                + birthdayDay + ", " + birthdayYear + ".");
        System.out.println("A buck fifty is $" + buckFifty + ".");
    }
}
