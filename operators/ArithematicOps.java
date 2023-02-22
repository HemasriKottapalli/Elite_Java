package operators;
import java.util.Scanner;
public class ArithematicOps {

	public static void main(String[] args) {
		//Arithematic Operators
		//System.out.println(10*10/5+3-1*4/2);
		// o/p :21;
		
		// Let's write a mini calci to understand
		
		int num1,num2;
		char op;
		float res=0;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter Num1: ");
		num1 = inp.nextInt();
		System.out.println("Enter Num2: ");
		num2 = inp.nextInt();
		System.out.println("Enter Operator: ");
		op = (char)inp.next().charAt(0);
		
		switch(op)
		{
		case '+' :
			res = num1+num2;
			break;
		case '-' :
			res = num1-num2;
			break;
		case '*' :
			res = num1*num2;
			break;
		case '/' :
			res = num1/num2;
			break;
		case '%' :
			res = num1%num2;
			break;
		default:
			System.out.println("Invalid Operator");
		}
		
		System.out.println("Result: "+res);
	}

}
