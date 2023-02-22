/* Solution by: Hemasri Kottapalli */

/*
The conditional operator is also known as ternary operator [exp ? true : false] can be used to make an either-or choice. 

Write a program to get a number from the user and find out whether it is odd or even.

Input format:

The input containing integer denotes the given number 

Output format:

If given number is even, print "Even". Otherwise, print "Odd".

Sample Input:
5

Sample Output:

Odd
 */
 import java.util.Scanner;
class TernaryOp
{
    public static void main(String args[])
    {
       Scanner inp = new Scanner(System.in);
       int num;
       num =inp.nextInt();
       String numIs = (num%2==0)?"even":"odd";
       System.out.println(numIs);
    }
}