package String;

public class RemoveStringduplicate {
	public static void main(String[] args) {
		String[]s= {"Ragul","Ragul","Vikash","Vishnu","Dharun"};
		int j=0;
		for(int i=0;i<s.length-1;i++)
		{
				if(s[i]!=s[i+1])
				{
					s[j++]=s[i];
				}
			}
		s[j++]=s[s.length-1];
		for(int k=0;k<j;k++)
		{
			System.out.println(s[k]);
		}	

	}

		
	}
