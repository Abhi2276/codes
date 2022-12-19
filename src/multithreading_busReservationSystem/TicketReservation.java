package multithreading_busReservationSystem;

public class TicketReservation {

	public static void main(String[] args) {
		
		TicketCounter tc=new TicketCounter();
		TicketBookingDetailsThread t1= new TicketBookingDetailsThread(tc, "Abhishek", 2);
		TicketBookingDetailsThread t2=new TicketBookingDetailsThread(tc,"jhon",2);
		
		t1.start();
		t2.start();

	}

}
