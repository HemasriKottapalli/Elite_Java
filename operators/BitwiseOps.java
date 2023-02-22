package operators;

public class BitwiseOps {

	public static void main(String[] args) {
	        //  |, &, ^
		    int a=10;
		    int b=11;
		    
		    System.out.println(a&b);
		    /*
		     * 10 --->  1010
		     * 11 --->  1011
		     * and op:  1010 =10
		     * */
		     
		    System.out.println(a|b);
		     /*
			     * 10 --->  1010
			     * 11 --->  1011
			     * or op:   1 011 =11
			     * */
			     
		    System.out.println(a^b);
			     /*
				     * 10 --->  1010
				     * 11 --->  1011
				     * XOR op:  0001 =1
				     * */
				     

	}

}
