/* Solution by : Hemasri Kottapalli */

/*
A teacher wants to compute the average of 5 students in her class. Write a program to help her to find the average.
The average is the sum of all the numbers, then divided by the total numbers.

Input format:

First input: 1st student mark in float

Second input: 2nd student mark in float

Third input: 3rd student mark in float

Fourth input:4th student mark in float

Fifth input: 5th student mark in float

Output format:

The output value should be in float with 2 decimal places.

Sample Input:

10 

20

30

40

50

Sample Output:

30.00

 */

 import java.util.Scanner;
class Average
{
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        float one= inp.nextFloat();
        float two= inp.nextFloat();
        float three= inp.nextFloat();
        float four= inp.nextFloat();
        float five= inp.nextFloat();
        
        float avg = (one+two+three+four+five)/5;
        System.out.printf("%.2f",avg);
    }
}