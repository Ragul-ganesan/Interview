package Array;

public class Find2ndlargest {
	public static void main(String[] args) {
		int[]a= {22,44,55,666,77,888};
		int temp;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]<a[j])
				{
				 temp=a[i];	
				 a[i]=a[j];
				 a[j]=temp;
				}
			}
		}
		System.out.println(a[1]);
	}

}
