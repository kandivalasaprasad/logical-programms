import java.util.Scanner;

public class perfectNum {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int n = s.nextInt();
		int sum = 0;
		//int d = 0;

		for (int i = 1; i <= n/2; i++) {
		int	d = n % i;
			if (d == 0) {
				sum = sum + i;
				System.out.print( sum + " " );

			}
		}
		if (sum == n) {
			System.out.println( "perfect number" + sum );
		}
		else if(sum != n) {
				System.out.println( "not a perfect number" );
		}
			}

		
	}


