import java.util.*;
public class ArmstrongNumber {
	static boolean isArmstrong(int n)
	{
		int temp =n;
		int sum=0;
		int len=String.valueOf(n).length();
		
		while(temp>0)
		{
			int digit =temp%10;
			sum  +=Math.pow(digit,len);
			temp =temp/10;
			
		}
		return n==sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 =scan.nextInt();
		//int n2 =scan.nextInt();
		if(isArmstrong(n1))
			{
				System.out.println("Armstrong");
			}
		else
		{
			System.out.println("Not Armstrong");
		}
		
		
		
		
		
//		Print Armstrong Numbers in the range.		
//		for(int i=n1;i<=n2;i++)
//		{
//			if(isArmstrong(i))
//			{
//				System.out.println(i);
//			}
//		}
//	
		
		
		
	}

}
