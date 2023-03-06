package returnTypesANDRecursion;
import java.util.Scanner;
public class Fibinocci {
    public static int fibinocci(int n) {
    	if(n==1)
    	{
    		return 0;
    	}
    	if(n==2)
    	{
    		return 1;
    	}
    	return fibinocci(n-1)+fibinocci(n-2);
    }
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		System.out.println(fibinocci(n));
	}

}
