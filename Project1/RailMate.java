package Project1;
import java.util.Scanner;
public class RailMate {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		UserDetails ud = new UserDetails();
		TrainDetails td = new TrainDetails();
		BookTicket bt = new BookTicket(); 
		System.out.println("********* Welocome to RailMate🚇*********");
		int i=1, choice=1;
		while(i!=0)
		{
			System.out.println("Select a option from 1 to 5:\n1.Register\n2.View Registration Details\n3.Add Train Details\n4.View Available Trains\n5.Book Tickets\n6.Exit");
			choice=inp.nextInt();
			switch(choice)
			{
			   case 1:
				   ud.getDetails();
				   break;
			   case 2:
				   ud.displayDetails();
				   break;
			   case 3:
				   System.out.println("Are you Admin? if yes, press 1 to continue or press 6 to exit!");
				   int option = inp.nextInt();
				   if(option==1) {
					   td.getTrainDetails();
				   }
				   else if(option==6)
				   {
					   System.exit(0);
				   }
				   break;
			   case 4:
				    td.availableTrains();
				    break;
			   case 5:
				    bt.bookMyTicket();
				    break;
			   case 6:
				   System.out.println("Thanks for visiting us!");
				   System.exit(0);
				   break;
			   default:
				   System.out.println("Invalid Choice");
			}
		}

	}

}
