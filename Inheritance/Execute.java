package Inheritance;

public class Execute {

	public static void main(String[] args) {
       
		/*Parent pc = new Parent();
        Child cc = new Child();
        pc.laptop();
        pc.house();
        pc.car();
        cc.bike();
        cc.mobilePhone();*/
        
        //without inheritance, accessing all 5 methids be like above
        //with Inheritance, we can access all 5 methods through only child object
        //cuz inheritance is all about enabling a class to have the properties of another class
        // we can do that using "extends" keyword
        //let's see how it works..
		 Child cc = new Child();
		 
		    cc.laptop();
	        cc.house();
	        cc.car();
	        cc.bike();
	        cc.mobilePhone();
		 
 	}                                                 

}
