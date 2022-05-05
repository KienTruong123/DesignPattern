package tdtu.edu.OrganizingData.ReplaceTypeCodewithSubclasses.Normal;

public class Staff {
	private int type;
	static final int CHEF = 0;
	static final int WAITER = 1;

	public Staff(int type) {
		type = type;
	}

	public int getType() {
		return type;
	}
}
