package dharun;

import java.util.Scanner;

public class Variabl_add {  
	public static void main(String[] args) {
//		int a = 3;
//		int b = 2;
//		int c = 3;
//		int d = (a*b*c);
//		int e = (a+b+c+d);
//		System.out.println(d);
//		System.out.println(e);
//		System.out.print(d+e);
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int d = a*b*c;
		int e = a+b+c;
		System.out.println("*************");
		System.out.println(d/e);
		
		
	}
} 
