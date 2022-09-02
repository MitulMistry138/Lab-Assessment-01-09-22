/*
program :-Create a class named 'Rectangle' with two data members- length and breadth and a function to calculate the area which is 'length*breadth'
author:- Mitul V Mistry 
date :- 01-09-2022 (Lab assessment) 
*/

import static java.lang.System.*; //importing package 
class Rect
{
    int length;
    int breadth;

     Rect()
    { 
        int length = 0;
        int breadth = 0;

    }

     Rect(int lenght)
    {
        this.length = 4 ;
         breadth = 5;

    }
     Rect(int length,int breadth)
    {
        this.length = 7;
        this.breadth = 8;
    }
     void m1()
    {
        out.println(length*breadth);
    }
}
 class Recatangle 
{
    public static void main(String ...args)
	{
        Rect obj = new Rect();
        obj.m1();
        Rect obj1= new Rect(15);
        obj1.m1();
        Rect obj2 = new Rect(26,6);
        obj2.m1();


    }
}

