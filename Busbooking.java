package busreservation;

import java.util.ArrayList;
import java.util.Scanner;

public class Busbooking {

	public static void main(String[] args) {
		  
		ArrayList <Bus> buses=new ArrayList <Bus>();
		ArrayList <Booking> bookings=new ArrayList<Booking>();
	
		buses.add(new Bus(1,2,true));
		buses.add(new Bus(2,2,false));
		buses.add(new Bus(3,30,false));
		buses.add(new Bus(4,35,true));
		
	
		int option=1;
		Scanner scanner=new Scanner(System.in);
	for(Bus b:buses) {
			
			b.displayBusinfo();
		}

		
		
		while(option==1) {
		System.out.println("enter 1 for booking 2 for Exit");
		  option=scanner.nextInt();
		  
		if(option==1) {
			
			Booking booking=new Booking();
			if(booking.isAvailable(bookings,buses)){
				bookings.add(booking);
				
				System.out.println("Your Booking is Confirmed");
			}
		
		
		else 
			System.out.println("Sorry ! Try another bus or another Date");
		}
		}
		}
	}

