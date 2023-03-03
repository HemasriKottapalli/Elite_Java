package arrays;

import java.util.Scanner;

public class IdentityMatrix {

	public static void main(String[] args) {
		/*
		        identity matrix:
		          
		              j=0 j=1 j=2
		         i=0    1  0  0
		         i=1    0  1  0
		         i=2    0  0  1 
		  
		 */
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter no.of rows and columns for a square matrix: ");
		int n = inp.nextInt();
        //input array
        System.out.println("enter elements for array to check if it forms an identity matrix:");
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++)
    	  { 
    		  for(int j=0; j<n; j++)
    		  {
    			  arr[i][j]=inp.nextInt();
    		  }
    	  }
        //checking if it's identityMatrix
        int flag1=0, flag2=0;
        for(int i=0; i<n; i++)
	   	  { 
	   		  for(int j=0; j<n; j++)
	   		  {
	   			 //diagnol elements
	   			  if(i==j && arr[i][j]==1)
	   			  {
	   				  flag1++;
	   			  }
	   			  //non diagnol elements
	   			  if(i!=j && arr[i][j]==0)
	   			  {
	   				  flag2++;
	   			  }
	   		  }
	   	  }
        if(flag1==n && flag2==n*(n-1))
        {
        	System.out.println("It's a Identity matrix!");
        }
        else
        {
        	System.out.println("It's not a Identity matrix!");
        }
	}

}
