import java.util.Scanner;

public class SwappingOfValues {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		//swaping of two variables with temp variable.
//		int temp;
//		temp =a;
//		a=b;
//		b=temp;
//		System.out.println(a);
//		System.out.println(b);
		
		//swaping of two variables without temp variable.
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);

	}

}
