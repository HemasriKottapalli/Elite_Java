package polymorphism;

import java.util.Scanner;

public class StaticPolymorphism {

	public static void main(String[] args) {
		//run time/ static polymorphism
		//method overloading
		//When 2 method names are same, particular method is executed depending on its signature.1
		Child obj = new Child();
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter int a:");
        int a = scan.nextInt();
        System.out.println("Enter int b:");
        int b = scan.nextInt();
        System.out.println("Enter int c:");
        int c=scan.nextInt();
        System.out.println("Enter float d:");
        float d=scan.nextFloat();
        System.out.println("Enter float e:");
        float e =scan.nextFloat();
        System.out.println("a+b: "+obj.add(a, b));
        System.out.println("a+b+c: "+obj.add(a, b, c));
        System.out.println("d+e: "+obj.add(d,e));
        System.out.println("a-b: "+obj.sub(a, b));
        System.out.println("a/b: "+obj.div(a, b));
       
	}

}
