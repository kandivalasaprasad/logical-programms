import java.util.Scanner;

public class FibonacciSeries {
	
	public static  int n = 0;
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the number N: ");
		int N = s.nextInt();
		int n1 = 0;
		int n2 = 1;
		int  Nth;
		if (N <= 0)
			System.out.println( "enter positive number" );
		else if (N == 1)
			System.out.println( "1" );
		else if (N>0){
		while(N > n){
			System.out.print( +n1 + " " );
			Nth = n1 + n2;
			n1 = n2;
			n2 = Nth ;
			n = n +  1;
		}
	}
	}
}
