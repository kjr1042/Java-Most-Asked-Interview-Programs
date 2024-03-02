import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int sum=0;
		while(n>0)
		{
			int digit =n%10;
			sum +=digit;
			n =n/10;
			
		}
		System.out.println(sum);
	}

}
