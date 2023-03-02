import java.util.Arrays;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		int[] arr = new int[3];
	//  5  6  7   1  2   3  4
		//1.starts at "="
		//2. "new" : creates a memory location
		//3. "int" : of data type int
		//4. "[3]" : of length 3
		//5. and assign it to a "int" object
		//6. i.e "[]": array
		//7. arr: identifier for that array
		
		//static 
		int[] daisyRanks = {1,2,3,6,5};
		System.out.println(daisyRanks[1]);
		
		//Understanding behind the scene
		
		
		//step1: 12 blocks address for 4*3= 12 for int array
		
		//| 1000 | 1001 | 1002 | 1003 | 1004 | 1005 | 1006 | 1007 | 1008 | 1009 | 1010 | 1011 |
		
		//step2: then it merges 4 cells together and only remembers starting address
		//precisely, it starts at 1000 and allocates 4 bytes to elemnt 1 such that 1000+4 will be the position of our 2nd element
		
		// |---------element1-------||---------element2-----||-------element3--------|
		//| 1000  |      |    |     | 1004 |    |     |     | 1008 |     |     |     |
		
		//float array
		float [] arr1 = {1.3f,3.4f,10.0f,6.78f};
		System.out.println(arr1[2]);
		
		//string array
		String [] strs = {"hema","doc","sri","daisy"};
		System.out.println(strs[0]);
		
		//some operations on arrays
		System.out.println(arr1.equals(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//taking i/p of array
		System.out.println("Enter no.of elements: ");
		Scanner inp = new Scanner(System.in);
		int n= inp.nextInt();
		int [] a = new int[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter element no."+(i+1)+" : ");
			a[i]=inp.nextInt();
		}
		//printing an array
        for(int i=0; i<n; i++)
        {
        	System.out.print(a[i]);
        }
	}

}
