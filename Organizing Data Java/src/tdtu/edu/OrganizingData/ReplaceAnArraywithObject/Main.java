package tdtu.edu.OrganizingData.ReplaceAnArraywithObject;

public class Main {
	public static void main(String[] args) {
		// Normal
		String[] row = new String[3];
		row[0] = "Kien";
		row[1] = "0909123456";
		row[2] = "HCM";

		// Should do
		People people = new People();
		people.setName("kien");
		people.setPhone("0909123456");
		people.setAddress("HCM");
		
		
		System.out.println("People [name=" + row[0] + ", phone=" + row[1] + ", address=" + row[2] + "]");
		System.out.println(people.toString());
	}
}
