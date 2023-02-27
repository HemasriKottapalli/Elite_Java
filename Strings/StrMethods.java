package Strings;
import java.util.Scanner;
public class StrMethods {

	public static void main(String[] args) {
	    
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter string:");
		//String str1 = inp.nextLine();
		String str1 = "Hemasri Kottapalli";
		//charAt()- returns character at given index
		System.out.println(str1.charAt(0));
		//codePointAt() - gives corresponding char's ascii val
		System.out.println(str1.codePointAt(0));
		//codePointBeforeTo() - gives orresponding char's before char's ascii val
		System.out.println(str1.codePointBefore(2));
		//counts from 0 to n-1
		//System.out.println(str1.codePointCount(3,12));
		//compares two strings and returns 0 if they are equal, +ve val if str1>str2, -ve val otherwise 
		String str2 ="hema";
		System.out.println(str1.compareTo(str2));
		//it compares irrespective of case
		System.out.println(str1.compareToIgnoreCase(str2));
		//concatenates 2 strings without space
		System.out.println(str1.concat(str2));
		//i contains.. returns true or false
		System.out.println(str1.contains("a"));
		//checks if a string end with string2
		System.out.println(str1.endsWith("a"));
		//equals can take any object and compares not only string
		System.out.println(str1.equals(str2));
		//equals method to ignore case
		System.out.println(str1.equalsIgnoreCase(str2));
		//returns index of the character
		System.out.println(str1.indexOf("a"));
		//prints canonical ;- the standard form of a name.
		System.out.println(str1.intern());
		//prints string length  
		System.out.println(str1.length());
		//prints last index
		System.out.println(str1.lastIndexOf("a"));
		//checks if 2 strs matches
		System.out.println(str1.matches("Hemasri Kottapalli"));
		//replacing
		System.out.println(str1.replace(str1,str2));

	    
	}

}
