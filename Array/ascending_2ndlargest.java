package Array;

public class ascending_2ndlargest {
	public static void main(String[] args) {
		int[]a= {777,66,444,332,11};
		int temp;
		for(int i=0;i<=a.length-1;i++)
		{
		 for(int j=i+1;i<=a.length-1;i++)
		 {
			 if(a[i]>a[j])
			 {
				 temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
			 }
		 }
		}
			
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		
	}

}
