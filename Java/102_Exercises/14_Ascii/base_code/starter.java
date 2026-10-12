/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		System.out.println("What exibit would you like to visit?");
		System.out.println("1. animals");
		System.out.println("2. sports");
		System.out.println("3. food");

		Scanner sc = new Scanner(System.in);
		String wow = sc.nextLine();

		if(wow.equals("animals")){
			System.out.println("What animal do you want to see?");
			System.out.println("1. Bird");
			System.out.println("2. Camel");
			String wowww = sc.nextLine();

			if(wowww.equals("Camel")){
				System.out.println(" //");
				System.out.println(" _oo\\");
				System.out.println("(__/ \\  _  _");
				System.out.println("\\  \\/ \\/ \\");
				System.out.println("(         )\\");
				System.out.println("\\_______/  \\");
				System.out.println("[[] [[]");
				System.out.println("[[] [[]");
			}
			if(wowww.equals("Bird")){
				System.out.println(">o)");
				System.out.println("(_>");
			}

		}
		else if(wow.equals("sports")){
			System.out.println("What sport do you want to look at?");
			System.out.println(" 1. Baseball");
			System.out.println(" 2. Football");
			String wowow = sc.nextLine();

			if(wowow.equals("Baseball")){
				System.out.println("  _______");
				System.out.println(" / |  |  \\");
				System.out.println("|  |  |  |");
				System.out.println("|  |  |  |");
				System.out.println("\\  |  |  /");
				System.out.println("********");
				if(wowow.equals("Football")){
					System.out.println("_.-====-._");
					System.out.println(".'\\-++++-//'.");
					System.out.println("(  ||      ||  )");
					System.out.println(".//      \\. ");
					System.out.println("`'-=..=-'`");

				}
				

			}

		}
		else if(wow.equals("food")){
			System.out.println("What food would you like to look at?");
			System.out.println("1. Pizza");
			System.out.println("2. Cake");
			String woww = sc.nextLine();

			if(woww.equals("Pizza")){
				System.out.println("//- ---.._");
				System.out.println("||  (_)  _ --._");
				System.out.println("||    _ (_)    '-.");
				System.out.println("||   (_)   __..-'");
				System.out.println(" \\__..--**");
			}
			if(woww.equals("Cake")){
				System.out.println(" $$  $$  $$");
				System.out.println(" __||__||__||__");
				System.out.println("| * * * * * * *|");
				System.out.println("|* * * * * * * |");
				System.out.println("| * * * * * * *|");
				System.out.println("|______________|");
			}


		}
		else{
			System.out.println("Thank you for choosing nothing. You may now leave the exibit.");
		}


		
		
	}
}
