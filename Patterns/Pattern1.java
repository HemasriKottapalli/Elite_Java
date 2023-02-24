package Patterns;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
	 
		/*
		 * * * * * 
         * * * * * 
         * * * * * 
         * * * * * 
         * * * * * 

		 */
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter n:");
		int n=inp.nextInt();
		for(int row=0; row<n; row++)
		{
			for(int col=0; col<n; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
