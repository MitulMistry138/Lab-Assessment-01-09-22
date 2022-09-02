/*
program :- Write a program that reads a set of integers, and then prints the sum of the even and odd integers.(using arrays)            	
author:- Mitul V Mistry 
date :- 01-09-2022 (Lab assessment) 
*/

import java.util.Scanner;     // importing package 
class SumOE
{
    public static void main(String ...args) 
    {
        int n, sE = 0, sO = 0;                // taking variables
        Scanner s = new Scanner(System.in);    // using scanner to take input from user
        System.out.print("Enter the number of elements in array:");  // input from user
        n = s.nextInt();
        int[] a = new int[n];             //creating a temporary variable   
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)             
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
                sE = sE + a[i];
            }
            else
            {
                sO = sO + a[i];
            }
        }
        System.out.println("Sum of Even Numbers:"+sE); // printing sum of even number
        System.out.println("Sum of Odd Numbers:"+sO);  // printing sum of odd number
    }
}