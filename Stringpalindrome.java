package abc;

public class Stringpalindrome {
	public static void main(String [] args)
	{
		String s1="man";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch =s1.charAt(i);
			s2=s2+ch;
		}
	
	if(s2.equals(s1))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
	}

}
