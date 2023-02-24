package Patterns;
import java.util.Scanner;
public class Series2 {

	public static void main(String[] args) {
		
       Scanner inp = new Scanner(System.in);
       System.out.println("Enter n:");
       int n = inp.nextInt();
       int j=1;
       for(int i=1; i<=n; i++)
       {
    	   j=j*3;
    	   System.out.print(j+" ");
       }
	}

}
