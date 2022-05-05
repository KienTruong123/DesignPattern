package tdtu.edu.OrganizingData.ChangeValuetoReference.Organizing;

import java.util.Dictionary;
import java.util.Hashtable;

public class Reservation {
	private Passenger passenger;

	public Reservation(Passenger passenger) {
		super();
		this.passenger = passenger;
	}

	public String getPassenger() {
		return passenger.getName();
	}

	public void setPassenger(String name) {
		this.passenger = Passenger.create(name);
	}

}
