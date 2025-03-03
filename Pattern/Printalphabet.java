package Pattern;

public class Printalphabet {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{char ch='a';
			for(int j=1;j<=5;j++)
			{
				System.out.print(ch+"\t");
				ch++;
			}
			System.out.println();
		}
	}

}
