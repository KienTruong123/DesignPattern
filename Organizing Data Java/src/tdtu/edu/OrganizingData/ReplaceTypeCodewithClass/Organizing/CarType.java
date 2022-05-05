package tdtu.edu.OrganizingData.ReplaceTypeCodewithClass.Organizing;
public class CarType {
	
	public static final CarType SUV = new CarType(0);
	public static final CarType COUPLE = new CarType(1);
	public static final CarType CONVERTIBLE = new CarType(2);
	public static final CarType ESTATE = new CarType(3);
	private static final CarType[] _values = { SUV, COUPLE, CONVERTIBLE, ESTATE };
	private final int _code;

	private CarType(int code) {
		_code = code;
	}

	public int getCode() {
		return _code;
	}

	public static CarType code(int arg) {
		return _values[arg];
	}
}
