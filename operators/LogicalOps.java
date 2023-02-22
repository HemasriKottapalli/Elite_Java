package operators;

public class LogicalOps {

	public static void main(String[] args) {
		
		//  && || !
		boolean isGirl=true;
		boolean isEligible = false;
		
		System.out.println(isGirl && isEligible);
		  /* && --->  0 && 0 = 0
                      0 && 1 = 0
                      1 && 0 = 0
                      1 && 1 = 1
                */
        System.out.println( isGirl || isEligible);
        /* || --->  0 && 0 = 0
                    0 && 1 = 1
                    1 && 0 = 1
                    1 && 1 = 1
  */
        System.out.println(isGirl);
        System.out.println(!isGirl);
         /*  
           ! ---> !0=1
                  !1=0
           */
        
      
	}

}
