import java.util.*;
public class StringPalindome {
	static boolean isPalindrome(String s)
	{
		String temp="";
		for(int i=s.length()-1;i>=0;i--)
		{
			temp = temp+s.charAt(i);
		}
		return s.equals(temp);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		
		if(isPalindrome(s))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}
