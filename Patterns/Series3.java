package Patterns;
import java.util.Scanner;
public class Series3 {

	public static void main(String[] args) {
		// 0 4 8 16 24 36 48 64 80 100
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = inp.nextInt();
        for(int i=1; i<=n; i++)
        {
        	if((i*i)%2==0)
        	{
        		System.out.print(i*i + " ");
        	}
        	else {
        		System.out.print((i*i)-1+" ");;
        	}
        }
	}

}
