package oops;
import java.util.Scanner;
class Greetings{
	public static void sayHello()
	{
		System.out.println("Hello");
	}
	
	public static void sayGm()
	{
		System.out.println("Good Morning");
	}
}
public class introduction {

	public static void main(String[] args) {
        System.out.println("Hey");
        Greetings obj = new Greetings();
        Class1 obj1 = new Class1();
        obj.sayHello();
        obj.sayGm();
        obj1.sayBye();
	}

}
