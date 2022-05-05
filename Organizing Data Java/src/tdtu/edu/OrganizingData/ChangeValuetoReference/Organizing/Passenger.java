package tdtu.edu.OrganizingData.ChangeValuetoReference.Organizing;

import java.util.Dictionary;
import java.util.Hashtable;

public class Passenger {
	private final String name;
	private static Dictionary<String, Passenger> _instances = new Hashtable();

	public static Passenger create(String name) {
		return new Passenger(name);

	}

	private Passenger(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static void loadPassengers() {
		new Passenger("Hero").store();
		new Passenger("Been").store();
		new Passenger("Heli").store();
	}

	private void store() {
		_instances.put(this.getName(), this);
	}

	public static Passenger getNamed(String name) {
		return (Passenger) _instances.get(name);
	}
}
