package Encapsulation;

import polymorphism.Nagarjuna;
//parent class
class Nagarjuna {
    public void act() {
  	  System.out.println("Nagarjuna is acting!");
    }
}
//child class
class NagaChaitanya extends Nagarjuna
{    
       public void act()
       { 
  /*line 1*/  super.act();//Nagarjuna is acting!
    	      System.out.println("NagaChaitanya is acting!");
       }
}

public class SuperIntro {

	public static void main(String[] args) {
		/*Whenever you create the instance of subclass,
		 an instance of parent class is created implicitly
		  which is referred by super reference variable.
		 */
		
         NagaChaitanya ng = new NagaChaitanya();
         ng.act();		// only "NagaChaitanya is acting!" will come if we remove line 1
         
         
	}

}
