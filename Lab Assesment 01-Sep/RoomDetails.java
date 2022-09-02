/*
program :- Write a program to create a room class, the attributes of this class is roomno, roomtype, roomarea and ACmachine. In this class the member functions are setdata and displaydata.	
author:- Mitul V Mistry 
date :- 01-09-2022 (Lab assessment) 
*/

import static java.lang.System.*;    // importing package java.lang

//Declaring class named as room 


class Room
{
    // instance variables
    private int roomno;
	private String roomtype;
	private double roomarea;
    private boolean acmachine;
		
	
	// method to print room details
	
	
	void displayDetails()        // create method name DisplayDetails
	{
		if(acmachine)                       // loop started 
		{
		out.println("Room No:-"+roomno);
		out.println("Room Type  "+roomtype);
		out.println("Area of room "+roomarea);
		out.println("AC room available "+acmachine);
		}
		else 
		{
			out.println("Room No:-"+roomno);
		    out.println("Room Type  "+roomtype);
		    out.println("Area of room "+roomarea);
			out.println("Non AC room available");
			
		}
		
	}
	
	 void setDetails(int r_n ,String type ,double r_area ,boolean ac_nonac)  // create method named as set details
	 {
		roomno= r_n;
		roomtype = type;
		roomarea  = r_area;
		acmachine = ac_nonac;
		 
	 }
	 
	 
}

class RoomDetails
{
	
public static void main(String ...args)
	{
		 
	    // creating object of the class named as ar   
		Room ar= new Room();

		// calling both main method 
		ar.setDetails(101, "DAafaD",16.15, false);
        ar.displayDetails();

	}
	
}
