import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the number: ");
		int n = s.nextInt();
		int sum  = 0;

		if (n == 1)
			System.out.println("prime number");
		else if (n == 2)
			System.out.println("prime number");
		else if (n >= 3) {

			for (int i = 1; i <= n / 2; i++) {
				int d = n % i;
				if(d == 0) {
					sum = sum + 1;}
			}
			if(sum == 1)
				System.out.println( "prime number" );
			else
				System.out.println( "not prime" );

				

		}
	}
}


