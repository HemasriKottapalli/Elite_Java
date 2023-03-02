package Arrays;
import java.util.Scanner;
class TwoDArray{
	public static void main(String[] args)
	{
		//startvalue+(arrayIndex*datatype block)
		
		/*     200 201 202 203 204 205 206 207 208
		       ________________
		    100|              |             |
		    101|              |
		    102|     val1     |
		    103|______________|
		    104
		    105
		    106       4 rows and 4 columns are allocated for val1 as its a int value
		    107
		    108
		 */
		//input elements in a 2D array
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter n to create nXn matrix:");
		int n =inp.nextInt();
		int [][] arr = new int[n][n];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				arr[i][j]=inp.nextInt();
			}
		}
		//Display 2D array
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		 
	}
}