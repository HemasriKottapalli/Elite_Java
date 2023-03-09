package oops;

public class Construct {
	  int a;
	  String b;
	  float c;
	  boolean d;
	  double e;
	  byte f;
	  char g;
	  long h;
	  short i;
	  void display()
	   {
		   System.out.println("int: "+ a +" | String: "+b+" | float:"+c+" | bool: "+d+" | double:"+e+" | byte:"+f+" | long:"+h+" | short:"+i+"| char:"+g+"|END|");

	   }
      double Construct()
      {
    	  System.out.println("Hello Yaar!");

      }
	public static void main(String[] args) {
		Construct obj = new Construct();
		//when an object is created, the constructor is executed
		System.out.println("Hello!");
        obj.display();
        //constructor assigns default values for variables based on their datatypes when not initialized
	}

}
