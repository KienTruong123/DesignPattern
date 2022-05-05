package tdtu.edu.OrganizingData.ReplaceTypeCodewithSubclasses.Organizing;

public class Waiter extends Staff {

	public Waiter(int type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
	public int getType() {
		return Staff.WAITER;
	}
}
