package multithreading_busReservationSystem;
import java.util.*;
public class TicketCounter {

	int availableSeat=3;
	
	public  synchronized void  bookTicket(String pName,int noOfSeat)
	{
		if(availableSeat>=noOfSeat&&noOfSeat>=0)
		{
			System.out.println("hi"+ " "+ pName+" "+noOfSeat+ " "+"seat has been booked successfully" );
			availableSeat=availableSeat-noOfSeat;
		}
		else
		{
			System.out.println("no seats available");
		}
	}
}
