package Methods;

public class Methods1 {
       
	  public static int a=10;
	  public static int b=20;
	   //method1 : access modifier-public
		public static int sum(int a,int b)
		{
			return a+b;
		}
		//method2 : access modifier-private
		private static int diff(int a,int b)
		{
			return a-b;
		}
		//method3 : access modifier-protected
		protected static int pro(int a,int b)
		{
			return a*b;
		}
		//method4 :: access modifier-default
		protected static int mod(int a,int b)
		{
			return a%b;
		}
		
	public static void main(String[] args) {
		
		System.out.println(sum(a,b));
		System.out.println(diff(a,b));
		System.out.println(pro(a,b));
		System.out.println(mod(a,b));
	}

}
/*
      Access Modifier |  class | package | subClass | world
                      |        |         |          |
       1.public       |  yes   |   yes   |   yes    |   yes
       2.protected    |  yes   |   yes   |   yes    |   no
       3.default      |  yes   |   yes   |   no     |   no
       4.private      |  yes   |   no    |   no     |   no
  
 */
