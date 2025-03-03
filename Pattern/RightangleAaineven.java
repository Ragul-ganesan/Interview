package Pattern;

public class RightangleAaineven {
	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{ 
			char ch='a';
			char ch1='A';
			for(int j=0;j<=i;j++)
			{
				if(i%2==0) {

				System.out.print(ch+"\t");
				ch++;
				}
				else 
				{
					System.out.print(ch1+"\t");
					ch1++;
				}
			}System.out.println();
		}
	}

}
