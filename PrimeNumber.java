import java.util.*;

public class PrimeNumber {
	static boolean isPrime(int n)
	{
		if(n<2)
		{
			return false;
		}
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1= scan.nextInt();
		//int n2= scan.nextInt();
		
// To check given number is prime or not.		
		if(isPrime(n1))
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not prime");
		}
		
//		To print the numbers in the range N1 and N2.
//		for(int i=n1;i<=n2;i++)
//		{
//			if(isPrime(i))
//			{
//				System.out.println(i);
//			}
//		}

		
//		print prime numbers upto N.
//		for(int i=1;i<=n1;i++)
//		{
//			if(isPrime(i))
//			{
//				System.out.println(i);
//			}
//		}
		
		
		
		
		

	}
}
