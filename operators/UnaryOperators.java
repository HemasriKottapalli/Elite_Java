package operators;
public class UnaryOperators {

	public static void main(String[] args) {
	 
		//Unary operators :- operates on single operand
		// ex: ++ , --
		
		//solve it
		int b=10;
		int A;
		A= b++ + b-- + --b +b-- + b++ + b++ + b-- - (b);
		System.out.println(A);
		
		/*
		   1. b++  +  b--    +   --b  +  b--  +  b++ + b--  -b
		      10   +  11     +   9    +  9    +  8    + 9    - 8 = 48
		      (b=11)  (b=10)    (b=9)   (b=8)   (b=9)   (b=8)  (b=8)
		 */
		
		
		// negating a number or inverting boolean 
		// ex: +, -, !
		
		int a=3;
		boolean yes=true;
		System.out.println(-a);
		System.out.println(+a);
		System.out.println(!yes);
		
	}

}     
