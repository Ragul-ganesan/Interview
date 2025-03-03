package Pattern;

public class alphabetRightangle {
	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			char ch='a';
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch+"\t");
				ch++;
			}
			System.out.println();
		}
	}

}
