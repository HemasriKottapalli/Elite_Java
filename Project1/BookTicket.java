package Project1;
import java.util.Scanner;
public class BookTicket extends TrainDetails{
	     Scanner inp = new Scanner(System.in);
         void bookMyTicket()
         {
        	 System.out.println("enter the no.of tickets: ");
        	 int tickets = inp.nextInt();
        	 if(tickets>ticketsAvailable) {
        		 System.out.println("Only "+ticketsAvailable+" tickets are available!");
        		  System.out.println();//prints a line gap
        	 }
        	 else {
        		 ticketsAvailable--;
        		 System.out.println("Congrtulations!\n"+tickets+"ticket for "+name+"("+trainNo+")"+"is conformed!");
        		  System.out.println();
        		 
        	 }
         }
}
