package busreservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
	String PassengerName;
	int busno;
	Date date;

public Booking(){
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter your  Name:");
	 PassengerName=scanner.next();
	
	
	System.out.println("Enter your  BusNo :");
	 busno=scanner.nextInt();
	
	
	System.out.println("Enter your date:");
	String  dateinput=scanner.next();
	
	SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
	try {
		date= dateformat.parse(dateinput);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}

	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		int capacity=0;
		for(Bus bus:buses) {
			if(bus.getBusNo()==busno) {
			capacity=bus.getCapacity();
		}}
	 int booked=0;
	 for(Booking b:bookings) {
		 if(b.busno==busno && b.date.equals(date)) {
			 booked++;
		 }
	 }
	  return booked<capacity?true:false;
	
}
}