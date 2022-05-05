package tdtu.edu.OrganizingData.SelfEncapsulateField;

public class NormalRectangle {
	private double length, width;

	public NormalRectangle() {
		length = 1;
		width = 1;
	}

	public NormalRectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getArea() {
		return (length * width);
	}

	public double getPerimeter() {
		return (2 * (length + width));
	}
}
