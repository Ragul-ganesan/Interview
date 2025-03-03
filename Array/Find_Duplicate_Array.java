package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Duplicate_Array {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a size value");
		int size=scn.nextInt();
		System.out.println("enter a value");
		int []a=new int[size];
		for(int i=0;i<=size-1;i++)
		{
			a[i]=scn.nextInt();
		}
		for(int i=0;i<=size-1;i++)
		{
			for(int j=i+1;j<=size-1;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}
			
		}System.out.println(Arrays.toString(a));
	}
//		int []a= {11,22,22,33,33,55};
//		for(int i=0;i<=a.length-1;i++)
//		{
//			for(int j=i+1;j<=a.length-1;j++)
//			{
//				if(a[i]==a[j])
//				{
//					System.out.println(a[j]);
//				}
//			}
//		}
//
//}
}
