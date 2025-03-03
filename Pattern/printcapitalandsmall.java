package Pattern;

public class printcapitalandsmall {
	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			char ch='A';
			char ch1='a';
		for(int j=0;j<=4;j++)
		{
			if(i%2==0)
			{
			System.out.print(ch+"\t");
			ch++;
		}
			else
			{
				System.out.print(ch1+"\t");
				ch1++;
			}
		}
		System.out.println();
	}

}
}
