package Pattern;

public class rightfullangle {
	public static void main(String[] args) {
		char ch='a';
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch+"\t");
				ch++;
			}
			System.out.println();
		}
		
	}

}
