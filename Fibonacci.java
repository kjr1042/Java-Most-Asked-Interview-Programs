import java.util.Scanner;

public class Fibonacci {
	public static int fibonacci(int n)
	{
		if(n<=1)
		{
			return n;
		}
		else
		{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		for(int i=0;i<=n;i++)
		{
			System.out.print(fibonacci(i)+" ");
		}
		
		
		
		
//		int a=0;
//		int b=1;
//		System.out.print(a+" "+b);
//		for(int i=2;i<=n;i++)
//		{
//			int c =a+b;
//			a = b;
//			b = c;
//			System.out.print(" "+c);
//		}

	}

}
