package Array;

import java.util.Scanner;

public class FindDuplicateArray {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Size:");
		int size=scn.nextInt();
		System.out.println("Enter the Values:");
		int a[]=new int[size];
		for(int i=0;i<=size-1;i++)
		{
			a[i]=scn.nextInt();
		}
		for(int i=0;i<=size-1;i++)
		{
			for(int j=i+1;j<size-1;j++)
			{
			  if(a[j]==a[i])
			  {
				  System.out.println(a[j]);
			  }
			}
		}
	}

}
