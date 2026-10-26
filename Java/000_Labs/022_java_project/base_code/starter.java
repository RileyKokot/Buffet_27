/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		 



        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int balance = 100;
        
        System.out.println("Welcome to the Digital Slot Machine!");
        System.out.println("You start with $" + balance + ".");
        
        while (balance > 0) {
            
            System.out.print("\nDo you want to play? (Y/N): ");
            String playChoice = scanner.next().trim();
            
            
            if (playChoice.equalsIgnoreCase("N") || playChoice.equalsIgnoreCase("No")) {
                break;
            } else if (!playChoice.equalsIgnoreCase("Y") && !playChoice.equalsIgnoreCase("Yes")) {
                System.out.println("Invalid input. Please enter Yes or No.");
                continue;
            }
            
            
            int wager = 0;
            while (true) {
                System.out.print("Enter your wager (Current balance: $" + balance + "): ");
                if (scanner.hasNextInt()) {
                    wager = scanner.nextInt();
                    if (wager > 0 && wager <= balance) {
                        break;
                    } else {
                        System.out.println("Invalid amount. You must wager between $1 and $" + balance + ".");
                    }
                } else {
                    System.out.println("Please enter a valid number.");
                    scanner.next(); // Clear invalid token
                }
            }
            
            
            int roll1 = random.nextInt(10);
            int roll2 = random.nextInt(10);
            int roll3 = random.nextInt(10);
            
            System.out.printf("Result: [%d] [%d] [%d]\n", roll1, roll2, roll3);
            
            
            if (roll1 == roll2 && roll2 == roll3) {
                // Three numbers match: Jackpot (Triple wagered money)
                int winnings = wager * 3;
                balance += winnings;
                System.out.println("JACKPOT! Three of a kind! You won $" + winnings + "!");
            } else if (roll1 == roll2 || roll1 == roll3 || roll2 == roll3) {
                // Two numbers match: Double wagered money
                int winnings = wager * 2;
                balance += winnings;
                System.out.println("Nice! Two of a kind! You won $" + winnings + "!");
            } else {
                // No matches: Lose wagered money
                balance -= wager;
                System.out.println("No matches. You lost $" + wager + ".");
            }
        }
        
        
        System.out.println("\n--- Game Over ---");
        if (balance <= 0) {
            System.out.println("You ran out of money!");
        } else {
            System.out.println("You walked away with: $" + balance);
        }
        System.out.println("Thanks for playing!");
        
        scanner.close();
    }
}


	

