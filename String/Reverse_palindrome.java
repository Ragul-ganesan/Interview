package String;

public class Reverse_palindrome {
	public static void main(String[] args) {
		String s="Ragul";
		char ch=' ';
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{

			ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("the given value is palindrome");
		}
		else
		{
			System.out.println("the given value is not palindrome");
		}
	}

}
