package String;

public class Removeduplicate {
	public static void main(String[] args) {
		char[] ch= {'a','a','b','c','d'};
		int j=0;
		for(int i=0;i<ch.length-1;i++)
		{
				if(ch[i]!=ch[i+1])
				{
					ch[j++]=ch[i];
				}
			}
		ch[j++]=ch[ch.length-1];
		for(int k=0;k<j;k++)
		{
			System.out.println(ch[k]);
		}	

//		for(int i=0;i<ch.length;i++)
//		{
//			for(int j=0+1;j<ch.length;j++)
//			{
//				if(ch[i]==ch[j])
//				{
//					System.out.println(ch[i]);
//				}
//				else {
//					System.out.println(ch[j\\
//				}
//			}
//		}
	}

}
