package Array;
public class Remove_Duplicate_Array {
	public static void main(String[] args) {
	
		int []a= {11,11,22,33,44};
//	int temp=a.length;
		int j=0;
		for(int i=0;i<a.length-1;i++)
		{
				if(a[i]!=a[i+1])
				{
					a[j++]=a[i];
				}
			}
		a[j++]=a[a.length-1];
		for(int k=0;k<j;k++)
		{
			System.out.println(a[k]);
		}				
	}
	}
	


//
//for(int i=0;i<=temp;i++)
//{
//for(int j=i+1;j<temp;j++)
//	{
//		if(a[i]==a[j])
//		{
//			System.out.println(a[i]);
//			
//		}
//		else {
//			System.out.println(a[j]);
//		}
	



