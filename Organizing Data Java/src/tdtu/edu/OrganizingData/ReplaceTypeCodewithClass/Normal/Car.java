package tdtu.edu.OrganizingData.ReplaceTypeCodewithClass.Normal;

public class Car {

	public static final int SUV = 0;
	public static final int COUPLE = 1;
	public static final int CONVERTIBLE = 2;
	public static final int ESTATE = 3;
	private int carType;

	public Car(int carType) {
		this.carType = carType;
	}

	public void setCarType(int carType) {
		this.carType = carType;
	}

	public int getCarType() {
		return carType;
	}
		
}