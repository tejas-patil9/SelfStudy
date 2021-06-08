package selfstudy;

import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		System.out.println("Taking input from the users");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int i = sc.nextInt();
		System.out.println("Enter number 2");
		int j = sc.nextInt();
		
		
		System.out.print("Addition of two numbers is ");
		System.out.println(i+j);
		System.out.print("Substractio of two numbers is ");
		System.out.println(i-j);
	}

}
