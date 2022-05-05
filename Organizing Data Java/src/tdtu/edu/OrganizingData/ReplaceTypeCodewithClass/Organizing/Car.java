package tdtu.edu.OrganizingData.ReplaceTypeCodewithClass.Organizing;

public class Car {
	public static final int SUV = CarType.SUV.getCode();
	public static final int COUPLE = CarType.COUPLE.getCode();
	public static final int CONVERTIBLE = CarType.CONVERTIBLE.getCode();
	public static final int ESTATE = CarType.ESTATE.getCode();
	
	private CarType carType;

	public Car(int carType) {
		this.carType = CarType.code(carType);
	}

	public int getCarType() {
		return carType.getCode();
	}

	public void setCarType(int arg) {
		carType = CarType.code(arg);
	}
}
