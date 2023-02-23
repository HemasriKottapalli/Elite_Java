/*Author: Hemasri Kottapalli*/
import java.util.Scanner;
import java.util.Random;
public class GuessTheNum {

	public static void main(String[] args) {
		
		System.out.println("Hey! lets us know your name: ");
		String name;
		Scanner inp = new Scanner(System.in);
		name = inp.next();

		System.out.println("Hey hii, "+name+"!!  Welcome to the gameee!");
		
		Random rand = new Random();
		int num=rand.nextInt(100);
		
		int guess=0;
		int chances=9;
		//System.out.println(num);
		while(chances>0)
		{
			System.out.println("Enter your guess:");
			guess=inp.nextInt();
			
			if(guess==num)
			{
				System.out.println(name+" That's perfect!! You won with "+ (chances-1) + " chances left!" );
				break;
			}
			else if(guess<num)
			{
				System.out.println(name+" It's smaller than expected! Guess bigger!");
				System.out.println("You have "+ chances +" chances left!");
			}
			else {
				System.out.println(name+" It's bigger than expected!! Guess smaller!");
				System.out.println("You have "+ chances +" chances left!");
			}
			
			chances--;
		}
		
		if(chances==0)
		{
			System.out.println("Sorry, you're out of chances! The number you had to guess was "+ num);
		}

	}

}
