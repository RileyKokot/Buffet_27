/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("--- Rectangle Pattern ---");
        try {
            System.out.print("Please enter a width: ");
            int width = sc.nextInt();
            System.out.print("Please enter a height: ");
            int height = sc.nextInt();

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Please enter valid integers.");
            return;
        }
        System.out.println("-".repeat(41));

        
        System.out.println("--- Standard Triangle Pattern ---");
        try {
            System.out.print("Please enter an integer: ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid integer.");
            return;
        }
        System.out.println("-".repeat(41));

        
        System.out.println("--- Reversed Star Pattern ---");
        try {
            System.out.print("Please enter an integer: ");
            int n_rev = sc.nextInt();
            for (int i = 1; i <= n_rev; i++) {
                // Prints spaces to push the stars to the right side
                for (int j = 0; j < n_rev - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid integer.");
        }
        
        sc.close();
    }
}
