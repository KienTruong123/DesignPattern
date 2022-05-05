package tdtu.edu.OrganizingData.ReplaceMagicNumberwithSymbolicConstant;

public class Main {
	final static  double PI  =3.14159;
	
	// should not
	public static double getCircumferenceOfCircle(double radius) {
		return 2 * 3.14159 * radius;
	}
	
	//should do
	public static double calculateCircumferenceOfCircle(double radius) {
		return 2 * PI * radius;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getCircumferenceOfCircle(5));
		System.out.println(calculateCircumferenceOfCircle(5));
	}

}
