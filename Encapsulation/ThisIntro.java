package Encapsulation;

public class ThisIntro {
    static int rollNo;
    static String name;
    static float marks;
	ThisIntro(int rollNo, String name, float marks)
	{
      /*rollNo = rollNo;//Vname = parameter 
      name=name;
      marks=marks;*/          
	 //o/p: 0 null 0.0
     //0 null 0.0  cuz this keyword is not used 
      this.rollNo = rollNo;
	  this.name=name;
	  this.marks=marks; 
	  //O/P: 111 hema 9.7
	  // 112 pranathi 9.4  with this keyword

	}
	public static void display()
	{
	  System.out.println(rollNo+" "+name+" "+marks);
	}
	public static void main(String[] args) {
		{
		/*
		The this keyword refers to the current object in a method or constructor.
	    The most common use of the this keyword is to eliminate the confusion between
	    class attributes and parameters with the same name.
			  
	  */
			ThisIntro t1 = new ThisIntro(111,"hema",9.7f);
			t1.display();
			ThisIntro t2 = new ThisIntro(112,"pranathi",9.4f);
			t2.display();
		}
		

	}

}
