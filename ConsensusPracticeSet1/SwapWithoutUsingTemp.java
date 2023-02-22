/*Solution by: Hemasri Kottapalli
*/
/*
Write a java program to swap two values without the use of 3rd variable.

Input format:

First input: an integer

Second input: an integer

Output format:

The output will be integers(swapped values)
Sample Input:

10

20

Sample Output:

20

10


*/

import java.util.Scanner;
class SwapWithoutUsingTemp
{
    public static void main(String args[])
    {
       Scanner inp = new Scanner(System.in);
       int a= inp.nextInt();
       int b= inp.nextInt();
       a=a+b;
       b=a-b;
       a=a-b;
       
       System.out.println(a+"\n"+b);
       
       
       ;
    }
}