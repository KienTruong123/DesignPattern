package tdtu.edu.OrganizingData.ReplaceTypeCodewithSubclasses.Organizing;

public class Staff {
	private int type;
	static final int CHEF = 0;
	static final int WAITER = 1;

	public Staff(int type) {
		this.type = type;
	}

	static Staff create(int type) {
		switch (type) {
		case CHEF:
			return new Chef(CHEF);
		case WAITER:
			return new Waiter(WAITER);

		default:
			throw new IllegalArgumentException("Incorrect type code value");
		}
	}
}
