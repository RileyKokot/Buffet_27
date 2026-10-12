/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int secretNumber = rand.nextInt(1000) + 1;

        System.out.print("Guess a number between 1 and 1000: ");
        int guess = sc.nextInt();

        if (guess > secretNumber) {
            System.out.println("Your guess is higher than the number.");
        } 
        else if (guess < secretNumber) {
            System.out.println("Your guess is lower than the number.");
        } 
        else {
            System.out.println("You guessed the number!");
        }
    }
}
