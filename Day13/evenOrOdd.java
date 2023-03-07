package Day13;
import java.util.Scanner;
public class evenOrOdd {

	public static void main(String[] args) {
		
           Scanner inp =new Scanner(System.in);
           int n = inp.nextInt();
           for(int i=1; i<n; i++)
           {
        	   if(i%2==0)
        	   {
        		   System.out.println("[ ] "+i);
        	   }
        	   else {
        		   System.out.println("[x] "+i);
        	   }
           }
	}

}
