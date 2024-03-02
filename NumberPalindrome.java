import java.util.*;
public class NumberPalindrome {
	static boolean isPalindrome(int n)
	{
		int temp =n;
		int rev=0;
		while(temp>0)
		{
			int lastDigit =temp%10;
			rev =rev*10+lastDigit;
			temp=temp/10;
		}
		return rev==n;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		if(isPalindrome(n))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
	}

}
