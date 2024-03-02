import java.util.*;
public class Factorial {
	//using recurssion.
	public static int factorialOfNumber(int n)
	{
		if (n==0)
		{
			return 1;
		}
		else
		{
			return n*factorialOfNumber(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int res =factorialOfNumber(n);
		System.out.println(res);
		
		//factorial of a program.
//		int fact=1;
//		if(n==0 || n==1)
//		{
//			System.out.println(1);
//			
//		}
//		else
//		{
//			for(int i=2;i<=n;i++)
//			{
//				fact =fact*i;
//			}
//		}
//		System.out.println(fact);
		
		
		
		
	}

}
