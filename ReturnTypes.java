
public class ReturnTypes {
    
	//1. return type: void
	public static void nun() {
		//does nothing
		System.out.println("hi");
	}
	//2. return type: int
	public static int sum(int a, int b)
	{
		return a+b;
	}
	//3. return type: float
	public static float sub(int a, int b)
	{
		return a-b;
	}
	//4. return type: double
	public static double div(int a, int b)
	{
		return a/b;
	}
	//5. return ype: char
	public static char firstChar(String name)
	{     return name.charAt(0);
		
	}
	//6. return type: Byte
	public static byte func0(byte a) {
		return a;
	}
	//7. return type: long
	public static long func1(long a)
	{
		return a;
	}
	//8. return type: long
	public static short func2(short a)
	{
		return a;
	}
	//return type: string
	public static String myName(String name)
		{     return name;
		}
	
	
	public static void main(String[] args){
		  //System.out.println("void: " + nun());
		  System.out.println("int: "+ sum(2,3));
		  System.out.println("float: " + sub(3,4));
		  System.out.println("double: " + div(2,5));
		  System.out.println("char: "+firstChar("hema"));
		  System.out.println("byte:: "+func0(127));
		  System.out.println("long: "+func1(6757));
		  System.out.println("short: "+func2(0));
		  System.out.println("String: "+myName("Hema"));
	}
    
}
