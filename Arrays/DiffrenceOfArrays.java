package Arrays;
import java.util.Scanner;
import java.util.Scanner;

public class DiffrenceOfArrays {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter no.of rows: ");
		int n = inp.nextInt();
		System.out.println("Enter no.of columns: ");
		int m = inp.nextInt();
        System.out.println("Enter the array elements: ");
       
        //input array1
        System.out.println("enter elements for array 1 :");
        int[][] arr1 = new int[n][m];
        for(int i=0; i<n; i++)
    	  { 
    		  for(int j=0; j<m; j++)
    		  {
    			  arr1[i][j]=inp.nextInt();
    		  }
    	  }
        
        //input array2
        System.out.println("enter elements for array 2 :");
        int[][] arr2 = new int[n][m];
        for(int i=0; i<n; i++)
    	  { 
    		  for(int j=0; j<m; j++)
    		  {
    			  arr2[i][j]=inp.nextInt();
    		  }
    	  }
       
        //Diffrence calculation
        int [][] arr3 = new int[n][m];
        for(int i=0; i<n; i++)
    	  { 
    		  for(int j=0; j<m; j++)
    		  {
    			  arr3[i][j]=arr1[i][j]-arr2[i][j];
    		  }
    	  }
        
        //print the resultant array
        System.out.println("Printing Aray:");
  	     for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}

	}

}
