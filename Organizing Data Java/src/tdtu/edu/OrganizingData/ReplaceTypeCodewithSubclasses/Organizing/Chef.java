package tdtu.edu.OrganizingData.ReplaceTypeCodewithSubclasses.Organizing;

public class Chef extends Staff {
	
	
	public Chef(int type) {
		super(type);
	}

	public int getType() {
		return Staff.CHEF;
	}

}
