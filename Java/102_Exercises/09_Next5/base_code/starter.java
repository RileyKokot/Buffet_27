/*
 *	Author: Riley Kokot
 *  Date: Sept 15 2026
 *	Collaborator(s):
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a number: ");
	int firstinput = sc.nextInt();
	System.out.println("Here are the next five nubers:");
	System.out.println(firstinput + 1);
	System.out.println(firstinput + 2);
	System.out.println(firstinput + 3);
	System.out.println(firstinput + 4);
	System.out.println(firstinput + 5);
	System.out.println("Here are the next five multiples of " + firstinput);
	System.out.println(firstinput * 1.0);
	System.out.println(firstinput * 2.0);
	System.out.println(firstinput * 3.0);
	System.out.println(firstinput * 4.0);
	System.out.println(firstinput * 5.0);
	System.out.println("Here is " + firstinput + " divided by 100");
	System.out.println(firstinput/100.0);
	System.out.println("Here is " + firstinput + " divided by 10");
	System.out.println(firstinput/10.0);
	}
}
