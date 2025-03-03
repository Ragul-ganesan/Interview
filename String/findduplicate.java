package String;

import java.util.Scanner;

public class findduplicate {
	public static void main(String[] args) {
//		Scanner scn=new Scanner(System.in);
//		System.out.println("enter size value");
//		int size=scn.nextInt();
//		System.out.println("Enter char value");
//		char[]ch=new char[size];
//	
//		for(int i=0;i<=ch.length-1;i++)
//		{
//			ch[i]=scn.next().charAt(0);
//		}
//		for(int i=0;i<=ch.length-1;i++)
//		{
//			for(int j=i+1;j<=ch.length-1;j++)
//			{
//				if(ch[i]==ch[j])
//				{
//					System.out.println(ch[j]);
//				}
//			}
//		}

		
		char[]ch= {'a','a','b','c'};
		for(int i=0;i<=ch.length-1;i++)
		{
			for(int j=i+1;j<=ch.length-1;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[j]);
				}
			}
		}
		
	}

}
