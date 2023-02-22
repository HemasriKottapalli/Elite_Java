package operators;

public class ShiftOps {

	public static void main(String[] args) {
		// << , >>
		
		int a=10;
		int b=2;
		// now let's left shift by 2 bits
		System.out.println(a<<b);
		//right shift (essentially divides a by b times)
		System.out.println(a>>b);
		
		
		/* Left shift:
		   10 ---> 00001010
		   2 ---> no.of shifts
		   
		           <-- 00101000 = 40
		 */
		
		/* Right shift:
		   10 ---> 00001010
		   2 ---> no.of shifts
		   
		          --> 00000010= 2
		 */
		
		

	}

}
