/* Reservation.java class created for a
 * small practice on conditional operators.
 * This class represents a restaurant's 
 * reservation management system. It accepts
 * the reservations by checking the availability
 * and the opening time of the restaurant */


public class Reservation {
	
	// All the instance fields necessary
	int guestCount;
	int restaurantCapacity;
	boolean isRestaurantOpen;
	boolean isConfirmed;
	
	// Constructor method to initialize our fields
	public Reservation (int count, int capacity, boolean open) {
		/* The restaurant doesn't accept the reservations
		 * for more than 8 people. Using OR operator here */
		if(count < 1 || count > 8) {
			// A message for overbooking
			System.out.println("Invalid reservation!");
		}
		guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
	}
	
	// A method that confirms a reservation
	public void confirmReservation() {
		/* AND operator checking if there are free tables
		 * when the restaurant is open */
		if (isRestaurantOpen && restaurantCapacity >= guestCount) {
			System.out.println("Reservation confirmed");
			// Because the statement is true, we assign this value to true
			isConfirmed = true;
		} else {
			System.out.println("Reservation denied");
			isConfirmed = false;
		}
	}
	
	/* After the reservation is either confirmed or denied,
	 * we can also let the customer know about the status of it.
	 * This is why the method below is created to send a message
	 * to the customer about it. */
	public void informUser() {
		/* I wanted to use the NOT conditional operator.
		 * That is why this IF statement looks like this.  */
		if(!isConfirmed) {
			System.out.println("We can't offer a table. We're deeply sorry");
		} else {
			System.out.println("The table is ready. Can't wait to see you soon!");
		}
	}
	
	/* Now we can use the main method to see the output of
	 * these methods above. */
	public static void main(String[] args) {
		// We create 2 different Reservation variables
		Reservation tableForThree = new Reservation(3, 8, true); // Assigned the values that were initialized in the constructor
		Reservation tableForFivee = new Reservation(5, 4, true); // Same here
		
		// Expecting 2 different outputs for those 2 Reservation variables
		tableForThree.confirmReservation();
		tableForThree.informUser();
		tableForFivee.confirmReservation();
		tableForFivee.informUser();
	}

}
