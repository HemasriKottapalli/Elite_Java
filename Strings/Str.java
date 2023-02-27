package Strings;

public class Str {

	public static void main(String[] args) {
		//string creation with new keyword(memory allocation in heap memory)
	  String str = new String("Pranathi");
	  System.out.println(str);
	  ////string creation without new keyword(memory allocation in SCP)
	  String str2 = "Hema";
	  System.out.println(str2);
	  //hash code of str2
	  System.out.println(str2.hashCode());
	  str2="Elsa";
	//hash code of str2 after updating
	  System.out.println(str2.hashCode());
	  
	  String s1="Andhra";
	  String s2="Andhra";
	  String s3="Andhra";
	  System.out.println(s1.hashCode());
	  System.out.println(s2.hashCode());
	  System.out.println(s3.hashCode());
	  s2="Frozen land";
	  System.out.println(s1.hashCode());
	  System.out.println(s2.hashCode());
	  System.out.println(s3.hashCode());
	}

}
