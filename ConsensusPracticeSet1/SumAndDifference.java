/*Solution by: Hemasri Kottapalli */

/*
Write a Java program to get 2 numbers from the user and calculate their sum and difference using '+' and '-' operators respectively.

Print the corresponding sum and difference of the numbers as output in the console.

Input format:

First input: an integer

Second input: an integer

Output format:

First output will be the sum of two integers

Second output will be the difference of two integers

Sample Input:

55

34

Sample Output:

89

21

*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
        {
            // fill your code
            int n1,n2;
            Scanner inp = new Scanner(System.in);
            n1= inp.nextInt();
            n2=inp.nextInt();
            int sum = n1+n2;
            int diff = n1-n2;
            System.out.println(sum);
            System.out.println(diff);
        }
}