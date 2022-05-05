package tdtu.edu.OrganizingData.SelfEncapsulateField;

public class Rectangle {
	private double length, width;

	public Rectangle(double length, double width) {
		super();
		initialize(length,width);
	}

	private void initialize(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getArea() {
		return (getLength() * getWidth());
	}

	public double getPerimeter() {
		return (2 * (getLength() + getWidth()));
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
}
