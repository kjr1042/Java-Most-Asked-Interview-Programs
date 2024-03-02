import java.util.Scanner;

public class PerfectNumber {
	static boolean isPerfect(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum +=i;
			}
		}
		return n==sum;
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n1 =scan.nextInt();
		int n2 =scan.nextInt();
		
//		To check given number is perfect or not	
//		if(isPerfect(n))
//		{
//			System.out.println("Perfect");
//		}
//		else
//		{
//			System.out.println("Not Perfect");
//		}
		
		
		for(int i=n1;i<=n2;i++)
		{
			if(isPerfect(i))
			{
					System.out.println(i);
			}
		}
	}

}
