package MyPackage;

import java.util.Scanner;

public class Addition_input {
	
	public static void main(String[]args) {
		
		int a;
		int b;
		int c,d,e,f;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value of a ");
		
		a = scan.nextInt();
		
		System.out.println("Enter value of b ");
		
		b = scan.nextInt();
		
		c=a+b;
		
		System.out.println("Addition is " + c);
		
		d=a-b;
		
		System.out.println("Subtraction is " + d);
		
		e=a/b;
		
		System.out.println("Division is " + e);
		
		f=a*b;
		
		System.out.println("Multiplication is " + f);
		
	}

}
