package tdtu.edu.OrganizingData.ReplaceDataValuewithObject.Normal;

import java.util.Collection;
import java.util.Iterator;

public class Reservation {
	private String passenger;

	public Reservation(String passenger) {
		super();
		this.passenger = passenger;
	}

	public String getPassengerName() {
		return passenger;
	}

	public void setPassengerName(String passenger) {
		this.passenger = passenger;
	}

	private static int numberOfOrdersFor(Collection orders, String customer) {
		int result = 0;
		Iterator<?> iter = orders.iterator();
		
		while (iter.hasNext()) {
			Reservation each = (Reservation) iter.next();
			if (each.getPassengerName().equals(customer))
				result++;
		}
		return result;
	}
}
