package Arrays;
import java.util.Scanner;
public class MaxInRow {
      public static void main(String[] args)
      {
    	  Scanner inp = new Scanner(System.in);
    	  System.out.println("Enter the no.of rows:");
    	  int n = inp.nextInt();
    	  System.out.println("Enter the no.of columns:");
    	  int m = inp.nextInt();
    	  System.out.println("Enter array Elemets: ");
    	  //input
    	  int[][] arr = new int[n][m];
    	  for(int i=0; i<n; i++)
    	  { 
    		  for(int j=0; j<m; j++)
    		  {
    			  arr[i][j]=inp.nextInt();
    		  }
    	  }
    	  //printArray
    	  System.out.println("Printing Aray:");
    	  for(int i=0; i<n; i++)
  		{
  			for(int j=0; j<m; j++)
  			{
  				System.out.print(arr[i][j]+" ");
  			}
  			System.out.println();
  		}
    	  //calculate max
    	  System.out.println("Printing Aray:");
    	  for(int i=0; i<n; i++)
    	  {    int max = arr[i][0];
    		  for(int j=0; j<m; j++)
    		  {
    			  if(arr[i][j]>max)
    			  {
    				  max=arr[i][j];
    			  }
    		  }
    		  System.out.println("max of row "+(i+1)+" : "+ max);
    	  }
      }
}
