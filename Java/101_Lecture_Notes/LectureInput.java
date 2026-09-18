/*
    Lecture note example - Input!!
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String menuheading1 = new String("Hello welcome to hand boys restraunt");
    String menuheading2 = new String("Heres what we got 😎");
    String menuitem1 = new String("1. salmon and avacoado handroll: ");
    double item1price = 12.00;
    String menuitem2 = new String("2. Tuna and lemon handroll: ");
    double item2price = 11.50;
    String menuitem3= new String("3. Ell and ell sauce sushi");
    double item3price = 10.00;
    String NAME1 = new String("Whats the name for your order?");
    
    System.out.println("Hello welcome to Hand Boys");
    System.out.println("Here's what we got 😎");
    System.out.println("1. salmon and avacoado handroll: " + item1price);
    System.out.println("2. Tuna and lemon handroll: " + item2price);
    System.out.println("3. Ell and ell sauce sushi: " + item3price);
    System.out.println();
    System.out.println(NAME1);

    String nAME1answer = sc.nextLine();

    System.out.println();

    Sysytem.out.println("How many Salmon Handrolls do you want?");
    int item1number = sc.nextInt();

    




	}
}
