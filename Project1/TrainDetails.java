package Project1;
import java.util.Scanner;
public class TrainDetails {
	//admin side
	  String name="Narasapur Express";//default values
      String startLocation="Narasapur";
      String destination="Hyderabad";
      String serviceType="Express";
      String trainNo="20AA0";
      int ticketsAvailable=1;
      Scanner inp = new Scanner(System.in);
      void getTrainDetails()
      {   
    	  System.out.println("Enter train name: ");
    	  name = inp.next();
    	  System.out.println("Enter starting location: ");
    	  startLocation =inp.next();
    	  System.out.println("Enter destination: ");
    	  destination = inp.next();
    	  System.out.println("Enter service type: ");
    	  serviceType= inp.next();
    	  System.out.println("Enter train number: ");
    	  trainNo= inp.next();
    	  System.out.println("Enter no of tickets available: ");
    	  ticketsAvailable= inp.nextInt();
    	  System.out.println();
      }
      //shows available trains
      void availableTrains()
      {
    	  System.out.println("Available trains: ");
    	  System.out.println("Train Name: "+name+"\nstart point: "+startLocation+"\ndestination: "+destination+"\nService Type:  "+serviceType+"\nTrain Number: "+trainNo+"\nTickets Available: "+ticketsAvailable);
    	  System.out.println();
      }
      
}
