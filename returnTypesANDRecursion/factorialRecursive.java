package returnTypesANDRecursion;
import java.util.Scanner;
public class factorialRecursive {
    public static int fact (int n)
    {
    	if(n==1) return 1;
    	else
    	{
          return n*fact(n-1);
    	}
    }
	public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       int n = inp.nextInt();
       int ans = fact(n);
       System.out.println("Factorial : "+ans);
	}

}
//how many times the method fact() is called?
//ans: 5
//how many times recursion is done?
// 4 ------> (n-1)