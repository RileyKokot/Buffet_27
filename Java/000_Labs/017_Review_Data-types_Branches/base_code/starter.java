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
        Scanner sc = new Scanner(System.in);

      
        System.out.println("Enter your character's name:");
        String name = sc.nextLine();

        System.out.println("Enter your character's title:");
        String title = sc.nextLine();

       
        System.out.println("Hello! Please Choose a role");
        System.out.println("1. Wizard");
        System.out.println("2. Rouge");
        System.out.println("3. Warrior");

        String dndnerd = sc.nextLine();
        String role = "";

        if (dndnerd.equals("Wizard") || dndnerd.equals("wizard") || dndnerd.equals("1")) {
            System.out.println("You are a wizard! You now have magical powers!");
            role = "Wizard";
        }
        else if (dndnerd.equals("Rouge") || dndnerd.equals("rouge") || dndnerd.equals("2")) {
            System.out.println("You are a Rouge! You now will rebel against the government!");
            role = "Rouge";
        }
        else if (dndnerd.equals("Warrior") || dndnerd.equals("warrior") || dndnerd.equals("3")) {
            System.out.println("You are a Warrior! You now are super strong!");
            role = "Warrior";
        }
        else {
            System.out.println("That is not an input.");
            role = "Unknown";
        }

      
        int pointsLeft = 20;

        
        System.out.println("\nStrength: Buff and able to carry larger items");
        System.out.println("Points left: " + pointsLeft);
        System.out.println("Enter Strength points (0-10):");
        int strength = sc.nextInt();

        if (strength > 10 || strength < 0 || strength > pointsLeft) {
            System.out.println("Invalid points! Strength set to 0.");
            strength = 0;
        }
        pointsLeft -= strength;
        System.out.println("Points left: " + pointsLeft);

      
        System.out.println("\nDexterity: Agile and moves quick");
        System.out.println("Points left: " + pointsLeft);
        System.out.println("Enter Dexterity points (0-10):");
        int dexterity = sc.nextInt();

        if (dexterity > 10 || dexterity < 0 || dexterity > pointsLeft) {
            System.out.println("Invalid points! Dexterity set to 0.");
            dexterity = 0;
        }
        pointsLeft -= dexterity;
        System.out.println("Points left: " + pointsLeft);

        
        System.out.println("\nIntelligence: Better at magic spells!");
        System.out.println("Points left: " + pointsLeft);
        System.out.println("Enter Intelligence points (0-10):");
        int intelligence = sc.nextInt();

        if (intelligence > 10 || intelligence < 0 || intelligence > pointsLeft) {
            System.out.println("Invalid points! Intelligence set to 0.");
            intelligence = 0;
        }
        pointsLeft -= intelligence;
        System.out.println("Points left: " + pointsLeft);

  
        System.out.println("\nCharisma: How personable");
        System.out.println("Points left: " + pointsLeft);
        System.out.println("Enter Charisma points (0-10):");
        int charisma = sc.nextInt();

        if (charisma > 10 || charisma < 0 || charisma > pointsLeft) {
            System.out.println("Invalid points! Charisma set to 0.");
            charisma = 0;
        }
        pointsLeft -= charisma;
        System.out.println("Points left: " + pointsLeft);

        
        System.out.println("\n===== CHARACTER SUMMARY =====");
        System.out.println("Name: " + name);
        System.out.println("Title: " + title);
        System.out.println("Role: " + role);

        System.out.println("\nStats:");
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Charisma: " + charisma);

        System.out.println("Points left over: " + pointsLeft);

        sc.close();
    }
}
	

