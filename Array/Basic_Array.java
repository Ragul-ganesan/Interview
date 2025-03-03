package Array;

import java.util.Scanner;

public class Basic_Array {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a size value");
		int size=scn.nextInt();
		System.out.println("enter a value");
		int []a=new int[size]; 
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=scn.nextInt();
		}
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}
//		int []a= {11,22,33,44,55};
//		for(int i=0;i<=a.length-1;i++)  
//		{
//			System.out.println(a[i]);
//		}
//
//}
}
