package String;

public class findstringduplicate {
	public static void main(String[] args) {
		String[]s= {"Ragul","Ragul","Vikash","Vishnu","Dharun"};
		for(int i=0;i<s.length-1;i++)
		{
			for(int j=i+1;j<=s.length-1;j++)
			{
				if(s[i]==s[j])
				{
					System.out.println(s[j]);
				}
			}
		}
	}

}
