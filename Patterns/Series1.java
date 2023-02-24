package Patterns;
import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
      //6,11,21,36,56
	  Scanner inp = new Scanner(System.in);
	  System.out.println("Enter n value:");
	  int n = inp.nextInt();
	  int j=6;
	  for(int i=1; i<=n; i++)
	  {   
		  System.out.print(j+" ");
		  j=j+(i*5);
		 
	  }

	}

}
