package tdtu.edu.OrganizingData.ReplaceDataValuewithObject.Organizing;

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
		this.passenger = new Passenger(name);
	}

}
