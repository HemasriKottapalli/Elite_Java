package package1;
import java.util.Scanner;
public class Class1 {
   public static void main(String[] args)
   {
	   Scanner inp = new Scanner(System.in);
	   System.out.println("Hello World!\n Enter your favourite Number :");
	   int favNum = inp.nextInt();
	   System.out.println("Enter your GPA");
	   float favGPA = inp.nextFloat();
	   System.out.println("Enter your name:");
	   String name = inp.next();
	   
	   System.out.println("You marks are "+ favNum+" out of 100 lol XD");
	   System.out.println("Your IQ is "+ favGPA + " less than that of a fly.. I'm not gonna lie!");
	   System.out.println("by reading the above facts, you must've already guessed your name! yeah it's you..."+ name + " the Miss.DUMB ");
   }
}
