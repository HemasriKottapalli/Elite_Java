package polymorphism;

class Parent {
	
	public static int add(int a, int b)
	{
		return a+b;
	}
	public static float add(float a, float b)
	{   
		return a+b;
	}
	public static int add(int a, int b, int c)
	{
		return a+b+c;
	}
	public static int sub(int a, int b)
	{
		return a-b;
	}
	public static int div(int a, int b)
	{
		return a/b;
	}
}
