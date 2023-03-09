package oops;
import java.util.Scanner;
class Overloader{
	void sum(int a)
	{
		System.out.println(a+a+" -by first fuction");
	}
	void sum(int a, int b)
	{
		System.out.println(a+b+" -by second fuction");
	}
}
public class Overloading {

	public static void main(String[] args) {
	    
        Overloader obj = new Overloader();
        obj.sum(2);
        obj.sum(2,3);
	}

}
