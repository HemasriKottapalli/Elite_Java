package operators;
import java.util.Scanner;
public class RelationalOps {

	public static void main(String[] args) {
		// >, <, >=, <=, ==, !=
	
		/*
		int a=5;
		int b=6;
		System.out.println( a>b );
		System.out.println( a<b );
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		Output:
             +false
             true
             false
             true
             false
             true

*/
		
		//Let's understand the usage through the following example
		
		System.out.println("Enter your marks: ");
		Scanner inp = new Scanner(System.in);
		int marks = inp.nextInt();
		
		if(marks >= 90 && marks<=100)
		{
			System.out.println("You got A grade for Acing the test!");
		}
		else if(marks >=80 && marks<90)
		{
			System.out.println("You got B grade! Good Enough!");
		}
		else if(marks >=70 && marks<80)
		{
			System.out.println("You got C! There's room for improvement1");
		}
		else if(marks >=60 && marks<70)
		{
			System.out.println("You got D grade! Do better next time!");
		}
		else if(marks >=40 && marks<60)
		{
			System.out.println("You got E grade!. You passed!");
		}
		else {
			System.out.println("Sorry! You didn't make it!");
		}
	}

}
