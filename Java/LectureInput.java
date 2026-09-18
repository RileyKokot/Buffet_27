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
    System.out.println("3. Eel and eel sauce sushi: " + item3price);
    System.out.println();
    System.out.println(NAME1);

    String nAME1answer = sc.nextLine();

    System.out.println();

    System.out.println("How many Salmon Handrolls do you want?");
    int item1number = sc.nextInt();

    System.out.println("How many Tuna Handrolls do you want?");
    int item2number = sc.nextInt();

    System.out.println("How many Eel sushi's do you want?");
    int item3number = sc.nextInt();

    double item1totalprice = (item1number * item1price);
    double item2totalprice = (item2number * item2price);
    double item3totalprice = (item3number * item3price);

    System.out.println("Total: ");
    System.out.println(item1totalprice);
    System.out.println(item2totalprice);
    System.out.println(item3totalprice);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    double subtotal = (item1totalprice + item2totalprice + item3totalprice);
    System.out.println("Sub Total:" + subtotal);

    System.out.println();
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("What percent would you like to tip?");
    int tip = sc.nextInt();
    double tippercent = (tip * 0.01);
    double tiptotal = (tippercent * subtotal);
    double totalfinal = (tiptotal + subtotal);
    System.out.println("Tip: " + tiptotal);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Total: " + totalfinal);






	}
}
