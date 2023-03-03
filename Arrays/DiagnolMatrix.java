package arrays;

import java.util.Scanner;

public class DiagnolMatrix {

	public static void main(String[] args) {
	      
		/*
        Diagnol matrix:
          
              j=0 j=1 j=2
         i=0    6  0  0
         i=1    0  7  0
         i=2    0  0  9
  
      */
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter no.of rows and columns for a square matrix: ");
		int n = inp.nextInt();
		//input array
		System.out.println("enter elements for array to check if it forms an Diagnol matrix:");
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++)
		  { 
			  for(int j=0; j<n; j++)
			  {
				  arr[i][j]=inp.nextInt();
			  }
		  }
		//printArray
		System.out.println("your array::");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		//checking if it's DiagnolMatrix
		int flag1=0, flag2=0;
		for(int i=0; i<n; i++)
			  { 
				  for(int j=0; j<n; j++)
				  {
					 //diagnol elements
					  if(i==j && arr[i][j]!=0)
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
			System.out.println("It's a Diagnol matrix!");
		}
		else
		{
			System.out.println("It's not a Diagnol matrix!");
		}
		   
			}


}
}