package arrays;
import java.util.Scanner;
public class MagicSquare {

	public static void main(String[] args) {
		  Scanner inp = new Scanner(System.in);
	   	  /*
	   	        ------MAGIC SQUARE-------
	   	            9  2  7
	   	            4  6  8
	   	            5  10 3
	   	            
	   	            how to check a magic square?
	   	            
	   	        IF  sumOfRow1 == sumOfRow2 == sumOfRow3
	   	          == sumOfCol1 == sumOfCol2 ==sumOfCol3
	   	          == diagnol1 == diagnol2
	   	        THEN YES IT'S PURE MAGIC  XD
	   	   */
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
		   //checking magic
		   int diagnol1Sum=0, diagnol2Sum=0, row1Sum=0, row2Sum=0, row3Sum=0, col1Sum=0, col2Sum=0, col3Sum=0; 
		   for (int i=0; i<n; i++)
		   {
			   for(int j=0; j<m; j++)
			   {
				 //---diagnol1---
				   if(i==j) {
					  diagnol1Sum +=arr[i][j];
			       }
				 //---diagnol2--- 
				   if(i+j==(n-1))
				   {
					   diagnol2Sum += arr[i][j];
				   }
				 //---row1---
				   if(i==0)
				   {
					   row1Sum+=arr[i][j];
				   }
				  //---row2---
				   if(i==1)
				   {
					   row2Sum+=arr[i][j];
				   }
				  //---row3---
				   if(i==2)
				   {
					   row2Sum+=arr[i][j];
				   }
				  //---col1---
				   if(j==0)
				   {
					   col1Sum+=arr[i][j];
				   }
				  //---col2---
				   if(j==1)
				   {
					   col2Sum+=arr[i][j];
				   } 
				  //---col3---
				   if(j==2)
				   {
					   col3Sum+=arr[i][j];
				   }
		   }      
		   }
		  
		   if(row1Sum == row2Sum && row2Sum == row3Sum && row3Sum== col1Sum && col1Sum== col2Sum && col2Sum== col3Sum && col3Sum== diagnol1Sum && diagnol1Sum== diagnol2Sum)
		   {
			   System.out.println("It's a Magic Square!!!");
		   }
		   else {
			   System.out.println("It's not a Magic Square.");
		   }
		   
	}

}
