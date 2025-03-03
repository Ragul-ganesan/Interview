package Array;

import java.util.Scanner;

public class Fibanoci_Series {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a size");
		int size=scn.nextInt();
		int sum=0;
		int []a=new int[size];
		a[0]=0;
		a[1]=1;
		for(int i=2;i<=size-1;i++) {
			a[i]=a[i-1]+a[i-2];
		}
		System.out.println("enter index value");
	System.out.println(a[5]);
	System.out.println("enter fibonacci series number");
        for(int i=0;i<=size-1;i++)
        {
        	System.out.print(a[i]);
        }
//        for(int i=0;i<=a.length-1;i++)
//        {
//        	sum=sum+a[i];
//        }
//        System.out.println("\n"+sum);
}
}
//0 1 1 2 3
//7