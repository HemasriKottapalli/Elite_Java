package returnTypesANDRecursion;
import java.util.Scanner;
public class Factorial {

	public static int factorial(int n) {
		int pro=1;
		for(int i=2; i<=n; i++)
		{
			pro*=i;
		}
		return pro;
	}
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter n:");
		int n= inp.nextInt();
		int ans = factorial(n);
		System.out.println("factorial of "+n+" is: "+ans);

	}

}
