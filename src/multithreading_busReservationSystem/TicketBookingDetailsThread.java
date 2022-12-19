package multithreading_busReservationSystem;
import java.util.*;
public class TicketBookingDetailsThread extends Thread {
	
private TicketCounter ticketCounter;

private String passengerName;

private int noOfSeatsToBook;

public TicketBookingDetailsThread(TicketCounter ticketCounter, String passengerName, int noOfSeatsToBook) {
	super();
	this.ticketCounter = ticketCounter;
	this.passengerName = passengerName;
	this.noOfSeatsToBook = noOfSeatsToBook;
}

public void run()
{
	ticketCounter.bookTicket(passengerName, noOfSeatsToBook);
}
}

