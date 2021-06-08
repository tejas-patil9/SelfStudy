package selfstudy;
import java.util.Scanner;


public class SwitchStatement {
public static void main(String[] args) {
	int age;
	System.out.println("Enter you age");
	Scanner sc = new Scanner(System.in);
	age = sc.nextInt();
	
	switch(age){
	case 18:
		System.out.println("You are an  adult !");
		break;
	case 22:
		System.out.println("You have graduated !");
		break;
	case 60:
		System.out.println("You have retired !");
		break;
	default:
		System.out.println("Enjoy your life!");
	}
	System.out.println("thank you for using my JAVA PROGRAMM ");
	
	

	
	
}
}
