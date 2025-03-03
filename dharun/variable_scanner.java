package dharun;

import java.util.Scanner;

public class variable_scanner {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		System.out.print("Enter the Name: ");
//		String a = scn.next();
//		System.out.println(a);
//		System.out.print("Enter the Age: "); 
//		int b = scn.nextInt();
//		System.out.println(b);
//		System.out.print("Enter the Address: ");
//		String c = scn.next();
//		System.out.print(c);
		
		
		System.out.print("Enter the Name: ");
		String name = scn.next();
		System.out.print("Enter the Age: ");
		int age = scn.nextInt();
		System.out.print("Enter the Address: ");
		String address = scn.next();
		System.out.println("*****************");
		System.out.println("my name : "+name);
		System.out.println("my age : "+age);
		System.out.println("my address : "+address);
	}
}
